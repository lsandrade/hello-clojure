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