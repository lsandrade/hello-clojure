(ns loja.logic)

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