(ns cljmap.db
  (:require [cljmap.data :as data]))

(def default-db (:features (js->clj data/my-data :keywordize-keys true)))

