import static groovy.json.JsonOutput.*

def call(Map args) {

    stage("A. Pull Source") {
        echo "${env.STAGE_NAME} called with: " + prettyPrint(toJson(args))
    }

}
