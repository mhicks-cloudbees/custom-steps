import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "codeQuality called with: " + prettyPrint(toJson(args))
}
