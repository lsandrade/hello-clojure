(ns hello-clojure.controle-financeiro)

; criando um mapa
(def transacao {:valor 200 :tipo "receita"})

; pegar elemento do mapa
(get transacao :valor)