import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "integrationTests called with: " + prettyPrint(toJson(args))
    library 'agents'
    addAgent('intTestAgent', '192.168.1.12', 'nodekey')
}
