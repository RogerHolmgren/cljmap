(ns cljmap.gmap
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [cljmap.subs :as subs]
    ))

(defn getLatLng [feature]
  (let [coord (get-in feature [:geometry :coordinates])]
      (.log js/console (str "coord: " coord))
    (js/google.maps.LatLng. (second coord) (first coord))))

(defn create-marker [map name latlng]
  (js/google.maps.Marker. (clj->js {:map map :position latlng :title name})))

(defn create-marker2 [map feature]
  (let [latlng (getLatLng feature)
        markerName "aoeu"]
    (create-marker map markerName latlng)))

(defn map-render []
  [:div
   [:h4 "Map"]
   [:div#map-canvas {:style {:height "400px" :width "600px"}}]])

(defn gmap-component []
  (let [gmap    (atom nil)
        options (clj->js {"zoom" 12})
        update  (fn [component-data]
                  (let [{:keys [type features]} (reagent/props component-data)
                        mark (create-marker (:map @gmap) "hello1" (getLatLng (first features)))
                        ]

                    ; (.log js/console (str "Type: " type))
                    ; (.log js/console (str "Features: " features))

                    ; TODO: Use a markerCluster?
                    (doseq [f features]
                      (.log js/console (str "Feature in doseq: " f))
                      (.setMap (create-marker2 (:map @gmap) f) (:map @gmap))
                      )

                    ; (.addListener mark)
                    ; (.setPosition mark (getLatLng (first features)))

                    ; (.log js/console (str "Marker from maps " (.getPosition ^js (:marker @gmap))))

                    (.panTo ^js (:map @gmap) (getLatLng (first features)))
                    ))]

    (reagent/create-class
      {:reagent-render map-render
       :component-did-mount (fn [component-data]
                              (let [canvas  (.getElementById js/document "map-canvas")
                                    gm      (js/google.maps.Map. canvas options)
                                    marker  (js/google.maps.Marker. (clj->js {:map gm :title "Drone"}))]
                                (reset! gmap {:map gm :marker marker}))
                              (update component-data))

       :component-did-update update
       :display-name "gmap-component"})))

(defn add-stuff [locations]
  (doseq [i (range (count locations))]
  (let [marker (js/google.maps.Marker.
                 (js/google.maps.LatLng. (get-in locations [i 1]) (get-in locations [i 2]))
                 {:map map})]
    (js/google.maps.addListener marker "click"))))

(defn gmap-wrapper []
  (let [features (rf/subscribe [::subs/mapFeatures])]
    (fn []
      ; (.log js/console @features)
      [gmap-component @features])))

