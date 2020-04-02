pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'docker rmi app'
                sh 'docker build -t app .'
            }
        }
        stage('Deliver') {
            steps {
                sh 'docker run -d -p 8088:8088 --name app app'
            }
        }
    }
}