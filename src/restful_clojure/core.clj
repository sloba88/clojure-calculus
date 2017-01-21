(ns restful-clojure.core)

;wrap response to json
(defn wrap-response [string]
  {:body {:error false :result string}}
)

;catch all exceptions
(defn wrap-exception-handling
  [handler]
  (fn [request]
    (try
      (handler request)
      (catch Exception e
        {:status 400 :body "Invalid data"}))))
