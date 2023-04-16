(ns cljmap.db
  (:require [cljmap.data :as data]))

(def default-db           ;; This gets loaded into app-db by default
  {:data data/my-data})

