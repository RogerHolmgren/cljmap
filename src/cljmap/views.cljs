(ns cljmap.views
  (:require
    [re-frame.core :as rf]
    ; [reagent.core :as reagent]
    [cljmap.events :as events]
    [cljmap.subs :as subs]
    ))


(defn display-user [{:keys [id avatar email] first-name :first_name}]
  [:div.horizontal {:key id}
   [:img.pr-15 {:src avatar}]
   [:div
    [:h2 first-name]
    [:p  (str "(" email ")")]]])

(defn main-panel []
  (let [name (rf/subscribe [::subs/name])
        users (rf/subscribe [::subs/users])]
    [:div
     [:h1
      "Hello from " @name "!!!!"]
     [:div 
      [:p "Paragraph"]
      (map display-user @users)
      [:button {:on-click #(rf/dispatch [::events/fetch-users])} "Make API Call"]
      [:button {:on-click #(rf/dispatch [::events/update-name "Kalle"])} "Update name"]
      ]
     ]))

