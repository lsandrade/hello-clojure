(ns loja.db)

(def pedido-1 {:usuario 10
              :itens {:mochila {:quantidade 2 :preco 60}
                      :camisa {:quantidade 1 :preco 20}
                      :tenis {:quantidade 1 :preco 0}}})

(def pedido-2 {:usuario 11
                :itens {:mochila {:quantidade 3 :preco 100}
                        :camisa {:quantidade 2 :preco 20}
                        :tenis {:quantidade 1 :preco 15}}})

(def pedido-3 {:usuario 12
                :itens {:mochila {:quantidade 1 :preco 80}
                        :camisa {:quantidade 10 :preco 10}
                        :tenis {:quantidade 1 :preco 10}}})

(def pedido-4 {:usuario 12
                :itens {:mochila {:quantidade 12 :preco 110}
                        :camisa {:quantidade 1 :preco 60}
                        :tenis {:quantidade 3 :preco 3}}})

(defn pedidos [] [pedido-1, pedido-2, pedido-3, pedido-4])