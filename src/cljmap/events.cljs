(ns cljmap.events
  (:require
    [cljmap.db :as db]
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
    (assoc db :mapData db/default-db)))

(rf/reg-event-db
  ::clear-filter
  (fn [db [_ _]]
    (dissoc db :my-filter)))

(rf/reg-event-db
  ::put-type-filter
  (fn [db [_ _]]
    (assoc db :my-filter {:type "ta" :estimated-traffic-effect "3"})))

(rf/reg-event-db
  ::focus-marker
  (fn [db [_ id]]
    (assoc db :focused-feature id)))

