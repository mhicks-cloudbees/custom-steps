import static groovy.json.JsonOutput.*

def call(Map args) {

    // If we are not in the correct stage, wrap with stage
    if(params.STAGE_NAME != "A. Pull Source") {
        stage("A. Pull Source") {
            pullSource(args)
            return
        }
    }
    
    echo "${params.STAGE_NAME} called with:"
    echo prettyPrint(toJson(args))
}
