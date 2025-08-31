(ns difference-of-squares)

(defn range-num [n] (range 1 (inc n)))
(defn square [n] (* n n))
(defn sum-seq [n] (reduce + n))
(defn square-seq [n] (map #(* % %) n)) 

(defn square-of-sum
  "Returns the square of the sum of the numbers up to the given number"
  [n]
  (->> n
       range-num
       sum-seq
       square))
 
(defn sum-of-squares
  "Returns the sum of the squares of the numbers up to the given number"
  [n]
  (->> n
       range-num
       square-seq  
       sum-seq))

(defn difference
  "Returns the difference between the square of the sum of numbers up to a given number and the sum of the squares of those numbers"
  [n]
  (- (square-of-sum n) (sum-of-squares n)))
