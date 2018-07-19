import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "${env.STAGE_NAME} called with: " + prettyPrint(toJson(args))
    println pullSource.dump()
}
