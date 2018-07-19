import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "codeCoverage called with: " + prettyPrint(toJson(args))
}
