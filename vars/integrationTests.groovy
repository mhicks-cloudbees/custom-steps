import static groovy.json.JsonOutput.*

library 'agents'

def call(Map args = [:], Closure body = {}) {
    println "integrationTests called with: " + prettyPrint(toJson(args))
    addAgent('intTestAgent', '192.168.1.12', 'nodekey')
}
