(ns macro-workshop.code-generation)

;; remember: you can use normal clojure sequence functions to generate code!

(defn generate-addition [a b]
  `(+ ~a ~b))

 (defn generate-multiplication [a b]
  `(* ~a ~b))

(defn generate-squarer []
  `(fn [x#] (* x# x#)))

(defn generate-hello-world-definition []
  `(fn [] (println "Hello World!")))

