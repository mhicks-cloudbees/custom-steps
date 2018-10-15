import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "unitTests called with: " + prettyPrint(toJson(args))
    steps.sh "mkdir tests || true; curl -o tests/log.xml https://gist.githubusercontent.com/n1k0/4332371/raw/14fdb095d43062da2a711e641b7b5e01ce455a32/log.xml"
}
