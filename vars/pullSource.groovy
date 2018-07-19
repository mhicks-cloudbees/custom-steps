import static groovy.json.JsonOutput.*

def call(Map args, Closure body) {
    echo "${env.STAGE_NAME} called with: " + prettyPrint(toJson(args))
    echo pullSource.dump()
}
