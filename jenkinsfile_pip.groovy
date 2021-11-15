pipeline{
    agent any
    stages{
        stage("cahitu stage"){
            steps{
                println "its my stage"
            }
        }
    }
}