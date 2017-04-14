(defproject net.cgrand/portkey "0.1.0-SNAPSHOT"
  :description ""
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.esotericsoftware/kryo "3.0.3"]
                 [com.twitter/carbonite "1.4.0"
                  :exclusions [com.esotericsoftware.kryo/kryo]]
                 [com.amazonaws/aws-java-sdk "1.11.63"]
                 [com.amazonaws/aws-lambda-java-core "1.1.0"]]
  :java-source-paths ["src/main/java"]
  :source-paths ["src/main/clojure"])