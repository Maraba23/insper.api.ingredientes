
// 51268
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package'
            }
        }   
        stage('Push Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credential') {
                        auth.push("${env.BUILD_ID}")
                        auth.push("latest")
                    }
                }
            }
        }
    }
}