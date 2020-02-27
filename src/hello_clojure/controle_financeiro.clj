(ns hello-clojure.controle-financeiro)

; criando um mapa
(def transacao {:valor 200 :tipo "receita"})

; pegar elemento do mapa
(get transacao :valor)
(:tipo transacao)

;retorna nil quando chave nao existe
(:nao-tem transacao)

; retorna {} como default para chave que nao tem
(:nao-tem transacao {})

(defn resumo [transacao]
  (select-keys transacao [:valor :tipo :data]))

(def transacoes [
                 {:valor 33.0 :tipo "despesa" :comentario "almoço" :data "01/02/2020"}
                 {:valor 1000.0 :tipo "receita" :comentario "freela" :data "02/02/2020"}
                 {:valor 26.0 :tipo "despesa" :comentario "livro de clojure" :data "03/02/2020"}])

(map resumo transacoes)

(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(despesa? (get transacoes 0))
(despesa? (get transacoes 1))

; filtra para trazer apenas despesas
(filter despesa? transacoes)

(defn get-valor [transacao] (:valor transacao))

; soma valores de despesas
(= 59.0 (reduce + (map get-valor (filter despesa? transacoes))))

; traz transacoe com valor > 100
(filter (fn [transacao]
          (> (:valor transacao) 100))
        transacoes)

; executa codigo na ordem que é lido (thread first)
(-> (first transacoes)
    (get-valor))

; thread last - soma despesas
(->> (filter despesa? transacoes)
     (map get-valor)
     (reduce +))