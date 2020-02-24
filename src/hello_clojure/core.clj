(ns hello-clojure.core)

(defn calcula-desconto
  "Realiza um cálculo de desconto simples"
  [valor]
  (* valor 0.9))

(calcula-desconto 100)
