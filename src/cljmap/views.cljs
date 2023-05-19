(ns cljmap.views
  (:require
   [cljmap.events :as events]
   [cljmap.gmap :refer [gmap-wrapper]]
   [cljmap.subs :as subs]
   [re-frame.core :as rf]
   [reagent.core :as reagent]))

(defn val-or-popup [v]
  (if (map? v)
    [:a "get details"]
    (str v)))

(defn to-prop-list [prop]
  ( let [k (key prop)
         v (val prop)]
    [:li {:key k} (str k ": ") (val-or-popup v)]
    ))

(defn counting-button [txt]
  (let [state (reagent/atom 0)] ;; state is accessible in the render function
    (fn [txt]
      [:button.button
       {:on-click #(swap! state inc)}
       (str txt " " @state)])))

(defn display-features [{my-type :type geo :geometry props :properties}]
  [:div {:key (:name props)}
   [:p (str "Type: " my-type)]
   [:p (str "geo-type: " (:type geo))]
   [:p (str "geo-coord: " (:coordinates geo))]
   [:ul (map to-prop-list props)]
   ])

;---- Form ----
(def animal-types ["Dog" "Cat" "Mouse"])

(defn text-input [id label]
  (let [value (rf/subscribe [::subs/form id])]
    [:div.field
     [:label.label label]
     [:div.control
      [:input.input {:value @value
                     :on-change #(rf/dispatch [::events/update-form id (-> % .-target .-value)])
                     :type "text" :placeholder "Text input"}]]]))

(defn select-input [id label options]
  (let [value (rf/subscribe [::subs/form id])]
    [:div.field
     [:label.label label]
     [:div.control
      [:div.select
       [:select {:value @value
                 :on-change #(rf/dispatch [::events/update-form id (-> % .-target .-value)])}
        [:option {:value ""} "Please select"]
        (map (fn [o] [:option {:key o :value o} o]) options)
        ]]]]))

(defn save-button []
  (let [is-valid? @(rf/subscribe [::subs/form-is-valid? [:animal-name :animal-type]])]
    [:button.button.is-primary {:disabled (not is-valid?)
                                :on-click #(rf/dispatch [::events/save-form])} "Save"]
    ))
;--------------

(defn main-panel []
  [:div.section
   [:h1.title "Geo data title"]
   [gmap-wrapper]
   ; (map display-features (:features @data))
   [:div.section
    [:button.button {:on-click #(rf/dispatch [::events/fetch-geodata 1])} "Update map"]
    [:button.button {:on-click #(rf/dispatch [::events/fetch-geodata 2])} "Update map2"]
    [counting-button "My button"]
    ]
   [:div.section
    [:h1.title "Update form"]
    [text-input :animal-name "Animal Name"]
    [select-input :animal-type "Animal Type" animal-types]
    [save-button]
    ]])

(comment
  (if true (val-or-popup "aueo") "bla")
  (map to-prop-list {:key1 "val1" :key2 {:a "a"}})
  )

