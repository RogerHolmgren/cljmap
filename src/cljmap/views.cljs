(ns cljmap.views
  (:require
    [cljmap.events :as events]
    [cljmap.gmap :refer [gmap-wrapper]]
    [cljmap.subs :as subs]
    [re-frame.core :as rf]))

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

