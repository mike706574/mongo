(defproject mike/mongo "0.0.1-SNAPSHOT"
  :license {:name "Eclipse Public License 1.0"
            :url "http://opensource.org/licenses/eclipse-1.0.php"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.novemberain/monger "3.1.0"]]
  :resource-paths ["resources" "test-resources"]
  :main manatee.core
  :aot :all)
