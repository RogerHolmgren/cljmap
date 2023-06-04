(ns cljmap.gmap
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [cljmap.subs :as subs]
    ))

(defn getLatLng [feature]
  (let [coord (get-in feature [:geometry :coordinates])]
    ; (.log js/console (str "coord: " coord))
    (js/google.maps.LatLng. (second coord) (first coord))))

(defn create-marker [map feature]
  (let [latlng (getLatLng feature)
        name (get-in feature [:properties :name])]
    (js/google.maps.Marker. (clj->js {:map map :position latlng :title name}))))

(defn map-render []
  [:div
   [:h4 "Map"]
   [:div#map-canvas {:style {:height "400px" :width "600px"}}]])

(defn clear-markers-from-map [markers]
  (doseq [m markers]
    (.setMap ^js m nil)))

(defn gmap-component []
  (let [gmap    (atom nil)
        markers (atom {})
        options (clj->js {"zoom" 12})
        update  (fn [this]
                  (let [{:keys [ mapData my-filter ]} (reagent/props this)]
                    ; (.log js/console (str "Features " mapData))
                    (clear-markers-from-map @markers)

                    (reset! markers (map #(create-marker @gmap %) (take my-filter mapData)))

                    (doseq [m @markers]
                      ; (.log js/console (str "Feature to add " (.getTitle ^js m)))
                      (.setMap ^js m @gmap)
                      (.addListener m @gmap)
                      )

                    (when (seq @markers)
                      (.panTo ^js @gmap (.getPosition ^js (first @markers))))
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
      [gmap-component @features])))

