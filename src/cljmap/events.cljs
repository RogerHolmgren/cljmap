(ns cljmap.events
  (:require
    [re-frame.core :as rf]
    ; [day8.re-frame.http-fx]
    [cljmap.data :as data]
    [cljmap.db :as db]))

(rf/reg-event-db
  ::initialize-db
  (fn [_ _]
    db/default-db))

; "This should be a REST-call to 'https://lund.panorama-gis.se/api/v1/public/objects'"
(rf/reg-event-db
  ::fetch-geodata
  (fn [db [_ _]]
      (assoc db :data (js->clj data/my-data :keywordize-keys true))))

