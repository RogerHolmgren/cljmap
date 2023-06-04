(ns cljmap.events
  (:require
    [cljmap.db :as db]
    [day8.re-frame.http-fx]
    [re-frame.core :as rf] 
    ))

(rf/reg-event-db
  ::initialize-db
  (fn [db [_ _]]
    (assoc db :mapData db/default-db :my-filter 1)))

"This should be a REST-call to 'https://lund.panorama-gis.se/api/v1/public/objects'"
(rf/reg-event-db
  ::fetch-geodata
  (fn [db [_ number]]
    (.log js/console (str "fetch-geodata with " number))
    (assoc db :mapData db/default-db)))

(rf/reg-event-db
  ::put-filter
  (fn [db [_ number]]
    (let [filtered-features (filter #(= (get-in % [:mapData :properties :type]) "ta") db)]
      ; (.log js/console (count filtered-features))
      ; (.log js/console (get-in db [:mapData :features]))
      ; (.log js/console db)
      (assoc db :my-filter number))))



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



