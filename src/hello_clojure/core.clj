(ns hello-clojure.core)

(defn calcula-desconto
  "Realiza um cálculo de desconto de 10%"
  [valor-bruto]
  (let [taxa-desconto (/ 10 100)]
  (let [valor-descontado (* valor-bruto taxa-desconto)]
  (- valor-bruto valor-descontado))))

(calcula-desconto 100)
