import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "compile called with: " + prettyPrint(toJson(args))
}
