(ns fizzbuzz.core)

(defn fizzbuzz [numero]
  (if (= 0 (mod 3 numero))
    (str "fizz")
    (if (= 0 (mod 5 numero))
      (str "buzz")
      (str "fizzbuzz"))))

; deve retornar fizz se numero for divisivel por 3
(= (fizzbuzz 3) "fizz")

; deve retornar buzz se numero for divisivel por 5
(= (fizzbuzz 5) "buzz")

; deve retornar fizzbuzz se divisivel por 3 e 5
(= (fizzbuzz 15) "fizzbuzz")
