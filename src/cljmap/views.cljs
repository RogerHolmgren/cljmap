(ns cljmap.views
  (:require
    [re-frame.core :as rf]
    [reagent.core :as reagent]
    [reagent.dom :as rdom]
    [cljmap.events :as events]
    [cljmap.subs :as subs]
    ))

(defn val-or-popup [v]
  (if (map? v)
    [:a "get details"]
    (str v)))

(defn to-prop-list [prop]
  ( let [k (key prop)
         v (val prop)]
    ; TODO: Handle 'estimated-effects'
    ; (.log js/console (str "V: " v " is map? " (map? v)))
    [:li {:key k} (str k ": ") (val-or-popup v)]
    ))

(defn display-features [{my-type :type geo :geometry props :properties}]
  ; (.log js/console (str "Props: " (get-props props)))
  [:div {:key (:name props)}
   [:p (str "Type: " my-type)]
   [:p (str "geo-type: " (:type geo))]
   [:p (str "geo-coord: " (:coordinates geo))]
   [:ul (map to-prop-list props)]
   ])

; --- maps
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
; ---

(defn main-panel []
  (let [data (rf/subscribe [::subs/data])]
    [:div
     [:h1 "Geo data title"]
     [gmap-wrapper]
     [:div 
      ; (.log js/console (str "Data: >>>>> " (:features @data)))
      (map display-features (:features @data))
      [:button {:on-click #(rf/dispatch [::events/fetch-geodata])} "Get geo-data"]
      ]
     ]))

(comment
  (map? {"oaeu" "oaeu"})
  (if true (val-or-popup "aueo") "bla")
  (map to-prop-list {:key1 "val1" :key2 {:a "a"}})
  )
