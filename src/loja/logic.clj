(ns loja.logic
  (:require [loja.db :as db]))

(defn total-do-item
  [[item-id detalhes]]
  (* (get detalhes :quantidade 0) (get detalhes :preco 0)))

(defn total-do-pedido
  [pedido]
  (reduce + (map total-do-item pedido)))

(defn conta-total-por-pedido [pedidos]
  (->> pedidos
       (map :itens)
       (map total-do-pedido)
       (reduce +)))

(defn total-gasto-por-usuario
  [[usuario pedidos]]
  {:usuario-id usuario
   :total-gasto (conta-total-por-pedido pedidos)})

(defn conta-total-por-usuario
  [[usuario pedidos]]
  {:usuario-id usuario
   :total-pedidos (count pedidos)})


(defn quantia-de-pedidos-e-gasto-total-por-usuario
  [[usuario pedidos]]
  {:usuario-id usuario
   :total-de-pedidos (count pedidos)
   :preco-total (conta-total-por-usuario pedidos)})


(defn resumo-por-usuario [pedidos]
  (->> pedidos
       (group-by :usuario)
       (map quantia-de-pedidos-e-gasto-total-por-usuario)))