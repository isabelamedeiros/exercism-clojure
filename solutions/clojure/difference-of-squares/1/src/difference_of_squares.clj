(ns difference-of-squares)

(defn square-of-sum
  "Returns the square of the sum of the numbers up to the given number"
  [n]
  (let [range (range 1 (inc n))
        sum-range (reduce + range)
        square (#(* % %) sum-range)] 
    square))

(defn sum-of-squares
  "Returns the sum of the squares of the numbers up to the given number"
  [n]
  (let [range (range 1 (inc n))
        square (map #(* % %) range)
        sum-square (reduce + square)]
    sum-square))

(defn difference
  "Returns the difference between the square of the sum of numbers up to a given number and the sum of the squares of those numbers"
  [n]
  (- (square-of-sum n) (sum-of-squares n)))
