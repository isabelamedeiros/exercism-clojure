(ns squeaky-clean
  (:require [clojure.string :as str]))

(defn clean [s]
  (-> (clojure.string/replace s #" " "_") 
      (clojure.string/replace #"[\u0000-\u001F\u007F-\u009F]" "CTRL")
      (clojure.string/replace #"-(\p{L})" #(clojure.string/upper-case (second %)))
      (clojure.string/replace #"[^\p{L}_]" "")
      (clojure.string/replace #"[α-ω]" "")))
