(ns cljmap.views
  (:require
    [cljmap.events :as events]
    [cljmap.gmap :refer [gmap-wrapper]]
    [cljmap.subs :as subs]
    [re-frame.core :as rf]))

(defn val-or-popup [v]
  (if (map? v)
    [:a "get details"]
    (str v)))

(defn to-prop-list [prop]
  ( let [k (key prop)
         v (val prop)]
    [:li {:key k} (str k ": ") (val-or-popup v)]
    ))

(defn display-features [{my-type :type geo :geometry props :properties}]
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
     [gmap-wrapper]
     ; (map display-features (:features @data))
     [:button {:on-click #(rf/dispatch [::events/fetch-geodata 1])} "Update map"]
     [:button {:on-click #(rf/dispatch [::events/fetch-geodata 2])} "Update map2"]
     ]))

(comment
  (map? {"oaeu" "oaeu"})
  (if true (val-or-popup "aueo") "bla")
  (map to-prop-list {:key1 "val1" :key2 {:a "a"}})
  )

; (.log js/console (str "x"))
