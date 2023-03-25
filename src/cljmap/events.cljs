(ns cljmap.events
  (:require
    [re-frame.core :as rf]
    [cljmap.db :as db]
    [day8.re-frame.http-fx]
    [ajax.core :as ajax]
    ))

(rf/reg-event-db
  ::initialize-db
  (fn [_ _]
    db/default-db))

(rf/reg-event-db
  ::update-name
  (fn [db [_ val]]
      (assoc db :name val)))

(rf/reg-event-fx
 ::fetch-users
 (fn [{:keys [db]} _]
   {:db   (assoc db :loading true)
    :http-xhrio {:method          :get
                 :uri             "https://lund.panorama-gis.se/api/v1/public/objects"
                 :timeout         8000
                 :response-format (ajax/json-response-format {:keywords? true})
                 :on-success      [::fetch-users-success]
                 :on-failure      [:bad-http-result]}}))

(rf/reg-event-db
 ::fetch-users-success
 (fn [db [_ {:keys [data]}]]
   (-> db
       (assoc :loading false)
       (assoc :users data))))

