(ns armstrong-numbers)

(defn armstrong?
  "Returns true if the given number is an Armstrong number; otherwise, returns false"
  [num]
  (let [digits (map #(Character/digit % 10) (str num))
        count-digits (count digits)
        powered (map #(Math/pow % count-digits) digits)
        sum-digits (reduce + powered)]
    (= (Math/round (double num)) (Math/round sum-digits))))