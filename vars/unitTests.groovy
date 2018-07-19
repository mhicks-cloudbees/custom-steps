import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "unitTests called with: " + prettyPrint(toJson(args))
}
