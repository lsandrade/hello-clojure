(ns hello-clojure.core)

(defn aplica-desconto?
  [valor]
  (> valor 100))

(defn calcula-desconto
  "Realiza um cálculo de desconto de 10% se deve aplicar"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-desconto (/ 10.0 100.0)
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(aplica-desconto? 101)
(aplica-desconto? 99)

(calcula-desconto aplica-desconto? 100)
(calcula-desconto aplica-desconto? 101)
