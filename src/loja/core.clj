(ns loja.core
  (:require [loja.db :as db])
  (:require [loja.logic :as logic]))

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

(defn conta-loop
  [elementos]
  (loop [total-parcial 0
         elementos-restantes elementos]
  (if (seq elementos-restantes)
    (recur (inc total-parcial) (next elementos-restantes))
    total-parcial)))

(conta 0 nomes)
(conta nomes)

(conta-loop nomes)

(println (db/pedidos))
(println (group-by :usuario (db/pedidos)))

; conta usuarios
(println (count (vals (group-by :usuario (db/pedidos)))))

; conta pedidos por usuario
(println (map count (vals (group-by :usuario (db/pedidos)))))

(->> (db/pedidos)
     (group-by :usuario)
     (map logic/conta-total-por-usuario)
     println)

(->> (db/pedidos)
     (group-by :usuario)
     (map logic/total-gasto-por-usuario)
     println)