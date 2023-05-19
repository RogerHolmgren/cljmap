(ns cljmap.subs
  (:require
    [re-frame.core :as rf]))

(rf/reg-sub
  ::mapFeatures
  (fn [db]
    (:mapData db)))

; (rf/reg-sub
;   ::current-position
;   (fn []
;     (:data {:latitude 57 :longitude 15})))

(rf/reg-sub
  ::form
  (fn [db [_ id]]
    (get-in db [:form id] "")))

(rf/reg-sub
  ::form-is-valid?
  (fn [db [_ form-ids]]
    (every? #(get-in db [:form %]) form-ids)))

