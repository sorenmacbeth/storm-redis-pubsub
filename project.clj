(defproject storm-redis-pubsub "0.0.2-SNAPSHOT"
  :source-path "src/clj"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib"]
  :aot :all
  :dependencies [[redis.clients/jedis "2.0.0"]]
  :dev-dependencies [[storm "0.7.0"]])

