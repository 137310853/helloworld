pipeline {
    agent any
    stages {

        stage('Build') {
            docker {
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'
            }
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Deliver') {
            steps {
                sh 'docker stop app'
                sh 'docker rm app'
                sh 'docker rmi app'
                sh 'docker build -t app .'
                sh 'docker run -d -p 8088:8088 --name app app'
            }
        }
    }
}