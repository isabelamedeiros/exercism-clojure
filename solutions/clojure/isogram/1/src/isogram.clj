(ns isogram)

(defn isogram?
  "Returns true if the given string is an isogram; otherwise, returns false"
  [s]
  (let [normalized-s (.toLowerCase s)
        letters-only (filter #(Character/isLetter %) normalized-s)
        letter-counts (frequencies letters-only)]
    (not-any? #(> (val %) 1) letter-counts)))