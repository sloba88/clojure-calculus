(ns restful-clojure.core
  (:require [ring.middleware.json :as middleware])
  (:require [ring.util.response :refer [response]]))

;wrap response to json
(defn- wrap-response [string]
  {:body {:result string}}
)

;catch all exceptions
(defn wrap-exception-handling
  [handler]
  (fn [request]
    (try
      (handler request)
      (catch Exception e
        {:status 400 :body "Invalid data"}))))
