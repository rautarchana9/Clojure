(defn map-each [func input]
   (loop [in input
          out []]
      (if (empty? in)
          out
          (recur (rest in)
                 (conj out
                      (func (first in)))))))

(def input [1 2 3 4])
(defn square [x] (* x x))
(map-each square input)
