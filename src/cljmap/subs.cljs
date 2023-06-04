(ns cljmap.subs
  (:require
    [re-frame.core :as rf]))

(rf/reg-sub
  ::mapFeatures
  (fn [db]
    db))

(rf/reg-sub
  ::filtered-features
  (fn [db]
    (:mapData db)))

(rf/reg-sub
  ::form
  (fn [db [_ id]]
    (get-in db [:form id] "")))

(rf/reg-sub
  ::form-is-valid?
  (fn [db [_ form-ids]]
    (every? #(get-in db [:form %]) form-ids)))

