(ns acronym)

(defn acronym
  "Converts phrase to its acronym."
  [phrase]
  (-> phrase
       (clojure.string/replace #"_" "")
       (clojure.string/split #"[\s-]")
       (->> (map first))
       clojure.string/join
       clojure.string/upper-case))