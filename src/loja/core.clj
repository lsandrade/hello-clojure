(ns loja.core)

(def nomes, ["Harry", "Rony", "Hermione"])

(map println nomes)
;(first nomes)

(defn meu-map
  [funcao vetor]
  (if (not (= 0 (count vetor)))
    (do
      (funcao (first vetor))
      (meu-map funcao (rest vetor)))))

(meu-map println nomes)