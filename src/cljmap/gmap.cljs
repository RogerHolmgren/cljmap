(ns cljmap.gmap
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [cljmap.subs :as subs]
    ))

(defn getLatLng [feature]
  (let [coord (get-in feature [:geometry :coordinates])]
    (js/google.maps.LatLng. (second coord) (first coord))))

(defn create-marker [map feature]
  (let [latlng (getLatLng feature)
        name (get-in feature [:properties :name])]
    (js/google.maps.Marker. (clj->js {:map map :position latlng :title name}))))

(defn map-render []
  [:div
   [:div#map-canvas {:style {:height "500px" :width "700px"}}]])

(defn clear-markers-from-map [markers]
  (doseq [m markers]
    (.setMap ^js m nil)))

(defn gmap-component []
  (let [gmap    (atom nil)
        markers (atom {})
        options (clj->js {"zoom" 11})
        update  (fn [this]
                  (let [{:keys [ mapData my-filter focused-feature ]} (reagent/props this)]
                    (clear-markers-from-map @markers)

                    (reset! markers (if-let [{:keys [type estimated-traffic-effect]} my-filter]
                                      (map #(create-marker @gmap %)
                                           (filter #(and (= type (get-in % [:properties :type]))
                                                         (= estimated-traffic-effect (get-in % [:properties :estimated-traffic-effect]))
                                                         ) mapData))
                                      (map #(create-marker @gmap %) mapData)))

                    (doseq [m @markers]
                      (.setMap ^js m @gmap)
                      (.addListener m @gmap)
                      )

                    (if focused-feature
                      (.panTo ^js @gmap (getLatLng focused-feature))
                      (.panTo ^js @gmap (getLatLng (first mapData)))
                      )
                    ))]

    (reagent/create-class
      {:reagent-render map-render
       :component-did-mount (fn [this]
                              (let [canvas  (.getElementById js/document "map-canvas")]
                                (reset! gmap (js/google.maps.Map. canvas options)))
                              (update this))

       :component-did-update update
       :display-name "gmap-component"})))

(defn gmap-wrapper []
  (let [features (rf/subscribe [::subs/mapFeatures])]
    (fn []
      ; (.log js/console (str (first @features)))
      [gmap-component @features]
      )))

