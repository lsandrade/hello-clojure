(ns hello-clojure.core)

(defn aplica-desconto?
  [valor]
  ( if (> valor 100)
    true
    false))

(defn calcula-desconto
  "Realiza um cálculo de desconto de 10%"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-desconto (/ 10.0 100.0)
          desconto (* valor-bruto taxa-desconto)]
        (- valor-bruto desconto))
                       valor-bruto))


(aplica-desconto? 101)

(calcula-desconto 101)
