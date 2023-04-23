(ns cljmap.gmap
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [cljmap.subs :as subs]
    ))


(defn gmap-component []
  (let [gmap    (atom nil)
        options (clj->js {"zoom" 9})
       update  (fn [component-data]
                  (let [{:keys [latitude longitude]} (reagent/props component-data)
                        latlng (js/google.maps.LatLng. latitude longitude)]
                    ; (.log js/console "comp")
                    ; (.log js/console (reagent/props component-data))
                    (.setPosition (:marker @gmap) latlng)
                    (.panTo (:map @gmap) latlng)
                    ))]

    (reagent/create-class
      {:reagent-render (fn []
                         [:div
                          [:h4 "Map"]
                          [:div#map-canvas {:style {:height "400px"}}]])

       :component-did-mount (fn [comp]
                              (let [canvas  (.getElementById js/document "map-canvas")
                                    gm      (js/google.maps.Map. canvas options)
                                    marker  (js/google.maps.Marker. (clj->js {:map gm :title "Drone"}))]
                                (reset! gmap {:map gm :marker marker}))
                              (update comp))

       :component-did-update update
       :display-name "gmap-component"})))

(let [{:keys [latitude longitude]} {:latitude 57 :longitude 15}]
  (str latitude ":" longitude)
  )

(defn gmap-wrapper []
  (let [pos (rf/subscribe [::subs/current-position])]
    (fn []
      (.log js/console @pos)
      [gmap-component {:latitude 57 :longitude 15}])))
