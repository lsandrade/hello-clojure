(ns fizzbuzz.core)

(defn divisivel-por? [divisor numero]
  (= 0 (mod numero divisor)))

(defn fizzbuzz [numero]
  (if (and (divisivel-por? 3 numero) (divisivel-por? 5 numero))
    (str "fizzbuzz")
    (if (divisivel-por? 3 numero)
      (str "fizz")
      (if (divisivel-por? 5 numero)
      (str "buzz")
      numero))))

; deve retornar fizz se numero for divisivel por 3
(= (fizzbuzz 3) "fizz")

; deve retornar buzz se numero for divisivel por 5
(= (fizzbuzz 5) "buzz")

; deve retornar fizzbuzz se divisivel por 3 e 5
(= (fizzbuzz 15) "fizzbuzz")

; deve retornar o proprio numero se nao for divisivel por 3 ou 15
(= (fizzbuzz 8) 8)