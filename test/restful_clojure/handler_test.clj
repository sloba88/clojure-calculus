(ns restful-clojure.handler-test
  (:use clojure.test
        ring.mock.request
        restful-clojure.handler))

(deftest test-app
  (testing "calculus endpoint"
    (let [response (app (request :get "/calculus/MTMqNQ=="))]
      (is (= (:status response) 200))
      (is (= (get-in response [:headers "Content-Type"]) "application/json; charset=utf-8")))))
