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

(defn feature-list []
  (let [{:keys [ mapData my-filter ]} @(rf/subscribe [::subs/mapFeatures])]
    [:div
     [:p (str "My filter: " my-filter)]

     (for [m (take (int my-filter) mapData)]
       [:button.button {:key (get-in m [:properties :name])
                        :on-click #(rf/dispatch [::events/focus-marker m])
                        } (str (get-in m [:properties :name]))]
       )
     ]
    ))

(defn main-panel []
  [:div.section
   [:h1.title "Geo data title"]
   [gmap-wrapper]
   [feature-list]
   [:div.section
    [:button.button {:on-click #(rf/dispatch [::events/put-filter 4])} "Simple filter 4"]
    [:button.button {:on-click #(rf/dispatch [::events/put-filter 8])} "Simple filter 8"]
    ]
   ])

(comment
  (if true (val-or-popup "aueo") "bla")
  (map to-prop-list {:key1 "val1" :key2 {:a "a"}})
  )

