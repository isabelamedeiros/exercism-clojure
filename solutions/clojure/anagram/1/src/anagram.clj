(ns anagram)

(defn anagrams-for [word prospect-list]
  (let [word-formatted (clojure.string/lower-case word)] 
      (->> prospect-list 
         (filter #(and (not= (clojure.string/lower-case %) word-formatted)
                       (= (sort (clojure.string/lower-case %)) (sort word-formatted)))))))

