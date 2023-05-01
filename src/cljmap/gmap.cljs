(ns cljmap.gmap
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [cljmap.subs :as subs]
    ))

(defn getLatLng [feature]
  (let [coord (get-in feature [:geometry :coordinates])]
    (js/google.maps.LatLng. (second coord) (first coord))))

(defn gmap-component []
  (let [gmap    (atom nil)
        options (clj->js {"zoom" 9})
        update  (fn [component-data]
                  (let [{:keys [type features]} (reagent/props component-data)]

                    (.log js/console (str "Type: " type))
                    (.log js/console (str "Features: " features))
                    (.log js/console (str "Geo: " (getLatLng (first features))))

                    (.setPosition (:marker @gmap) (getLatLng (first features)))
                    (.panTo (:map @gmap) (getLatLng (first features)))
                    ))]

    (reagent/create-class
      {:reagent-render (fn []
                         [:div
                          [:h4 "Map"]
                          [:div#map-canvas {:style {:height "400px"}}]])

       :component-did-mount (fn [component-data]
                              (let [canvas  (.getElementById js/document "map-canvas")
                                    gm      (js/google.maps.Map. canvas options)
                                    marker  (js/google.maps.Marker. (clj->js {:map gm :title "Drone"}))]
                                (reset! gmap {:map gm :marker marker}))
                              (update component-data))

       :component-did-update update
       :display-name "gmap-component"})))

(let [{:keys [latitude longitude]} {:latitude 57 :longitude 15}]
  (str latitude ":" longitude)
  )

(defn gmap-wrapper []
  (let [features (rf/subscribe [::subs/data])]
    (fn []
      ; (.log js/console @features)
      [gmap-component @features])))

