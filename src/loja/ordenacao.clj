(ns loja.ordenacao
  (:require [loja.db :as db])
  (:require [loja.logic :as l.logic]))

;(println db/pedidos)

(defn resumo-ordenado-por-usuario
  [pedidos]
  (->> pedidos
       l.logic/resumo-por-usuario
       (sort-by :preco)))

(let [resumo (resumo-ordenado-por-usuario (db/pedidos))
      pedidos (db/pedidos)]
  (println "Resumo" resumo)
  (println "Ordenado" (sort-by :preco resumo))
  (println "Ordenado ao contrario" (reverse (sort-by :preco resumo)))
  (println "Ordenado por id" (sort-by :usuario-id resumo))
  (println (get-in pedidos [0 :itens :mochila :quantidade])))

;(resumo-ordenado-por-usuario db/pedidos)