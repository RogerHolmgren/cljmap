(ns cljmap.gmap
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [cljmap.subs :as subs]
    ))

(def max-markers 20)

(defn getLatLng [feature]
  (let [coord (get-in feature [:geometry :coordinates])]
    (.log js/console (str "coord: " coord))
    (js/google.maps.LatLng. (second coord) (first coord))))

(defn create-marker [map feature]
  (let [latlng (getLatLng feature)
        name (get-in [:properties :name] feature)]
    (js/google.maps.Marker. (clj->js {:map map :position latlng :title name}))))

(defn map-render []
  [:div
   [:h4 "Map"]
   [:div#map-canvas {:style {:height "400px" :width "600px"}}]])

(defn gmap-component []
  (let [gmap    (atom nil)
        options (clj->js {"zoom" 12})
        update  (fn [component-data]
                  (let [{:keys [features]} (reagent/props component-data)]
                    ; TODO: Use a markerCluster?
                    (doseq [f (take max-markers features)]
                      (.log js/console (str "Feature in doseq: " f))
                      (.addListener (create-marker @gmap f) @gmap)
                      )

                    (.panTo ^js @gmap (getLatLng (first features)))
                    ))]

    (reagent/create-class
      {:reagent-render map-render
       :component-did-mount (fn [component-data]
                              (let [canvas  (.getElementById js/document "map-canvas")]
                                (reset! gmap (js/google.maps.Map. canvas options)))
                              (update component-data))

       :component-did-update update
       :display-name "gmap-component"})))

(defn gmap-wrapper []
  (let [features (rf/subscribe [::subs/mapFeatures])]
    (fn []
      ; (.log js/console @features)
      [gmap-component @features])))

