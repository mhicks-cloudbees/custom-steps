import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "pullSource called with: " + prettyPrint(toJson(args))
}
