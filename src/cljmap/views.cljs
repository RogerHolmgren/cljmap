(ns cljmap.views
  (:require
    [re-frame.core :as rf]
    ; [reagent.core :as reagent]
    [cljmap.events :as events]
    [cljmap.subs :as subs]
    ))

(defn count-prop-types [props]
  )

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

(map to-prop-list {:key1 "val1" :key2 {:a "a"}})

(map? {"oaeu" "oaeu"})
(if true (val-or-popup "aueo") "bla")

(defn display-features [{my-type :type geo :geometry props :properties}]
  ; (.log js/console (str "Props: " (get-props props)))
  [:div {:key (:name props)}
   [:p (str "Type: " my-type)]
   [:p (str "geo-type: " (:type geo))]
   [:p (str "geo-coord: " (:coordinates geo))]
   [:ul (map to-prop-list props)]
   ])

(defn main-panel []
  (let [data (rf/subscribe [::subs/data])]
    [:div
     [:h1 "Geo data title"]
     [:div 
      (.log js/console (str "Data: >>>>> " @data))
      (map display-features (:features @data))
      [:button {:on-click #(rf/dispatch [::events/fetch-geodata])} "Get geo-data"]
      ]
     ]))

