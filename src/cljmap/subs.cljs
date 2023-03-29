(ns cljmap.subs
  (:require
    [re-frame.core :as rf]))

(rf/reg-sub
  ::data
  (fn [db]
    (:data db)))

