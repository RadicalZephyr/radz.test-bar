(ns radz.test.bar
  (:require radz.test.qux))

(def number 2)

(defn qux-number []
  radz.test.qux/number)
