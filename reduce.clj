(defn reduce-all [func init input]
     (loop [acc init
            in (seq input)]
        (if (empty? in)
            acc
            (recur (func acc (first in))
                             (rest in)))))

(reduce-all + 1 [1 2 3])
