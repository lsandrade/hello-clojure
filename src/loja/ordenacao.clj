(ns loja.ordenacao
  (:require [loja.db :as db])
  (:require [loja.logic :as l.logic]))

(let [resumo (l.logic/resumo-ordenado-por-usuario (db/pedidos))
      pedidos (db/pedidos)]
  (println "Resumo" resumo)
  (println "Ordenado" (sort-by :preco resumo))
  (println "Ordenado ao contrario" (reverse (sort-by :preco resumo)))
  (println "Ordenado por id" (sort-by :usuario-id resumo))
  (println (get-in pedidos [0 :itens :mochila :quantidade])))
