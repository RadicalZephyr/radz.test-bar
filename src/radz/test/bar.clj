(ns radz.test.bar
  (:require radz.test.qux))

(def number 1)

(defn qux-number []
  radz.test.qux/number)
