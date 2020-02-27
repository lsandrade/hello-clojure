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
