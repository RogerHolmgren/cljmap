(ns cljmap.views
  (:require
    [re-frame.core :as re-frame]
    [dommy.core :as dommy :refer-macros [sel1]]
    [cljmap.subs :as subs]
    [cljmap.components :refer [*map*] :as comp]
    ))

;; init coords
(def lon -76.874382)
(def lat 40.2725855)

(defn buy-button [item-id]
  [:button
   {:on-click (fn [e]
                (.preventDefault e)
                (re-frame/dispatch [:buy item-id]))}
   "Buy"])




(defn create-map
  "Create a Google Map element, center it, and assign it to the *map* var."
  []
  (let [map-opts (clj->js {"center" (google.maps.LatLng. lat lon)
                           "zoom" 13
                           "mapTypeId" "roadmap"})]
    (set! *map* (google.maps.Map. (sel1 :#map) map-opts))))




(create-map)






(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1
      "Hello from " @name "!!!!"]
     [:div 
      [:p (buy-button 1)]
      ]
     ]))

