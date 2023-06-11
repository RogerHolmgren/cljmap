(ns cljmap.views
  (:require
    [cljmap.events :as events]
    [cljmap.gmap :refer [gmap-wrapper]]
    [cljmap.subs :as subs]
    [re-frame.core :as rf]))

(defn feature-list []
  (let [{:keys [ mapData my-filter ]} @(rf/subscribe [::subs/mapFeatures])]
    [:div {:style {:overflow-y "auto" :max-height "520px" :width "300px" :margin-left "30px"}}
     (for [m 
           (if-let [{:keys [ type estimated-traffic-effect ]} my-filter]
             (filter #(and (= type (get-in % [:properties :type]))
                           (= estimated-traffic-effect (get-in % [:properties :estimated-traffic-effect])))
                     mapData)
             mapData)
           ]
       [:div {:style {:border "2px outset black"
                      :margin "2px"
                      :background-color "lightgrey"
                      :width "96"}
              :key (get-in m [:properties :name])
              :on-click #(rf/dispatch [::events/focus-marker m])
              } 
        [:p (get-in m [:properties :name])]
        [:p (get-in m [:properties :address])]
        ]
       )
     ]
    ))

(defn main-panel []
  [:div.section
   [:h1.title "Geo data title"]
   [:div {:style {:display "flex"}}
    [gmap-wrapper]
    [feature-list]
    ]
   [:div.section
    [:button.button {:on-click #(rf/dispatch [::events/put-type-filter {:type "ta" :estimated-traffic-effect 3}])} "Filter for type \"ta\""]
    [:button.button {:on-click #(rf/dispatch [::events/clear-filter])} "Clear filter"]
    ]
   ])

