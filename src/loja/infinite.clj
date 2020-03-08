(ns loja.infinite
  (:require [loja.db :as db])
  (:require [loja.logic :as l.logic]))

(defn gastou-bastante?
  [info-usuario]
  (> (:preco-total info-usuario) 500))

(let [pedidos (db/pedidos)
      resumo (l.logic/resumo-ordenado-por-usuario pedidos)]
  (println "keep" (keep gastou-bastante? resumo))
  (println "filter" (filter gastou-bastante? resumo)))


(println (take 2 (range 1000000)))