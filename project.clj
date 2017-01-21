(defproject restful-clojure "0.1.0-SNAPSHOT"
  ; ...project settings...

  ; The lein-ring plugin allows us to easily start a development web server
  ; with "lein ring server". It also allows us to package up our application
  ; as a standalone .jar or as a .war for deployment to a servlet contianer
  ; (I know... SO 2005).
  :plugins [[lein-ring "0.10.0"]]

  ; See https://github.com/weavejester/lein-ring#web-server-options for the
  ; various options available for the lein-ring plugin
  :ring {:handler restful-clojure.handler/app
         :nrepl {:start? true
                 :port 9998}}
                 
   :min-lein-version "2.0.0"

  :profiles
  {:dev {:dependencies [
                        [org.clojure/clojure "1.7.0"]
                        [ring/ring-core "1.2.1"]
                        [ring/ring-jetty-adapter "1.2.1"]
                        [compojure "1.1.6"]
                        [ring/ring-json "0.4.0"]
                        [javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
