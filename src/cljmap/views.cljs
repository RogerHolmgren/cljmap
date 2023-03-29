(ns cljmap.views
  (:require
    [re-frame.core :as rf]
    ; [reagent.core :as reagent]
    [cljmap.events :as events]
    [cljmap.subs :as subs]
    ))


(defn display-features [{my-type :type geo :geometry}]
  (.log js/console (str "dat: " geo))
  [:div
   [:p (str "Type: " my-type)]
   [:p (str "geo-type: " (:type geo))]
   [:p (str "geo-coord: " (:coordinates geo))]
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

