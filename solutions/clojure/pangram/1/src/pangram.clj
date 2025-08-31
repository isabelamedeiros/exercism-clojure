(ns pangram)

(defn pangram?
  "Returns true if the given string is a pangram; otherwise, returns false"
  [s]
  (let [normalized-s (.toLowerCase s)
        letters-only (filter #(Character/isLetter %) normalized-s)
        unique-letters (set letters-only)]
    (= (count unique-letters) 26)))
