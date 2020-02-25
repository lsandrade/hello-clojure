(ns hello-clojure.core)

(defn aplica-desconto? [valor] (> valor 100))

(defn calcula-desconto
  "Realiza um cálculo de desconto de 10% se deve aplicar"
  [aplica? valor-bruto]
  (if (aplica? valor-bruto)
    (let [taxa-desconto (/ 10.0 100.0)
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(defn calcula-desconto-simples
  "Realiza um cálculo de desconto de 10% se deve aplicar"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-desconto (/ 10.0 100.0)
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))


(aplica-desconto? 101)
(aplica-desconto? 99)

(calcula-desconto aplica-desconto? 100)
(calcula-desconto aplica-desconto? 101)

; Usando função anonima
(calcula-desconto (fn [valor] (> valor 100)) 100)
(calcula-desconto (fn [valor] (> valor 100)) 101)
; '#' para definir função, '%1' = primeiro parametro
(calcula-desconto #(> %1 100) 100)
(calcula-desconto #(> %1 100) 101)

; calcula desconto para varios precos
(println (map calcula-desconto-simples precos))

; imprime pares de 0 a 20
(println (filter even? (range 20)))

; filtra elementos para aplicat desconto
(println (filter aplica-desconto? precos))

(println (map calcula-desconto-simples (filter aplica-desconto? precos)))

; soma todos os precos
(reduce + precos)