import static groovy.json.JsonOutput.*

def call(Map args = [:], Closure body = {}) {
    println "standardBuild called with: " + prettyPrint(toJson(args))

    node() {
        stage("A. Pull Source")   { pullSource(args)   }
        stage("B. Compile")       { compile(args)      }
        stage("C. Unit Tests")    { unitTests(args)    }
        stage("D. Code Coverage") { codeCoverage(args) }
        stage("E. Code Quality")  { codeQuality(args)  }
    }

}
