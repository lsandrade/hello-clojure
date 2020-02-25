(ns hello-clojure.aula4)

(def precos [30 700 1000])

; imprime precos[0]
(println (precos 0))

; precos[2]
(println (get precos 2))

; precos[7] = retorna nulo
(println (get precos 7))

; adiciona valor no final do vetor. Não modifica o vetor original
(println (conj precos 500))

; atualiza elemento no vetor
(update precos 0 inc)
(update precos 1 dec)

(defn soma-1 [valor] (+ valor 1))

(update precos 2 soma-1)