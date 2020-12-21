pipeline {
    agent any

    triggers {
        pollSCM 'H/3 * * * *'
    }

    stages {
        stage ('Build') {
            steps {
                sh './gradlew clean compileJava'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew clean compileTestJava'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -f Dockerfile-jar -t java-springboot-api .'
            }
        }
    }

}