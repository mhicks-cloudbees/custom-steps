import static groovy.json.JsonOutput.*

def call(Map args) {

    stage("A. Pull Source") {
        echo "${params.STAGE_NAME} called with:"
        echo prettyPrint(toJson(args))
    }

}
