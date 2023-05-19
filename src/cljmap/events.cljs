(ns cljmap.events
  (:require
    [cljmap.db :as db]
    [cljmap.data :as data]
    [day8.re-frame.http-fx]
    [re-frame.core :as rf] 
    ))

(rf/reg-event-db
  ::initialize-db
  (fn [db [_ _]]
    (assoc db :mapData db/default-db)))

"This should be a REST-call to 'https://lund.panorama-gis.se/api/v1/public/objects'"
(rf/reg-event-db
  ::fetch-geodata
  (fn [db [_ number]]
    (.log js/console (str "fetch-geodata with " number))
    (assoc db :mapData (js->clj data/my-data :keywordize-keys true))))

(rf/reg-event-db
  ::update-form
  (fn [db [_ id val]]
    (assoc-in db [:form id] val)))

(rf/reg-event-db
  ::save-form
  (fn [db]
    (let [form-data (:form db)
          animals (get db :animals [])
          updated-animals (conj animals form-data)]
      (-> db
        (assoc :animals updated-animals)
        (dissoc :form)))))

