pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                //git 'https://github.com/BBB-UNAM/Automation_2022.git'

                // Run Maven on a Unix agent.
                sh "mvn clean"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }

        stage('Test') {
            steps {

                // Run Maven on a Unix agent.
                sh "mvn test"

            }
        }
    }

    post {
            always {
                 cucumber buildStatus: 'UNSTABLE',
                         reportTitle: 'My report cucumber',
                         fileIncludePattern: '**/*.json',
                         trendsLimit: 10,
                         classifications: [
                             [
                                 'key': 'Browser',
                                 'value': 'Chrome'
                             ]
                         ]
            }

    }

}