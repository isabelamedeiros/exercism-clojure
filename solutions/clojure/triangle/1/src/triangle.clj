(ns triangle)

(defn triangle?
  [a b c]
  (and (> a 0) (> b 0) (> c 0)
       (>= (+ a b) c)
       (>= (+ b c) a)
       (>= (+ a c) b)))

(defn equilateral?
  "Returns true if the triangle with sides a, b, and c is equilateral; otherwise, returns false"
  [a b c]
  (and (triangle? a b c)(= a b c)))

(defn isosceles?
  "Returns true if the triangle with sides a, b, and c is isosceles; otherwise, returns false"
  [a b c]
  (and (triangle? a b c)(or (= a b) (= a c) (= b c))))

(defn scalene?
  "Returns true if the triangle with sides a, b, and c is scalene; otherwise, returns false"
  [a b c]
  (and (triangle? a b c)(and (not= a b) (not= a c) (not= b c))))
