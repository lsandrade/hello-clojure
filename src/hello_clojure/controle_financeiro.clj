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