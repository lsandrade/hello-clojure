(ns loja.core)

(def nomes, ["Harry", "Rony", "Hermione"])

(map println nomes)
;(first nomes)

(defn meu-map
  [funcao vetor]
  (if (not (nil? (first vetor)))
    (do
      (funcao (first vetor))
      (recur funcao (rest vetor)))))

(meu-map println nomes)

(defn conta

  ([elementos]
   (conta 0 elementos))
  ([total-parcial elementos]

  (if (seq elementos)
    (recur (inc total-parcial) (next elementos))
    total-parcial)))

(conta 0 nomes)
(conta nomes)