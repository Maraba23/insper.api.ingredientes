
// 51268
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn clean package'
            }
        }   
  
        stage('Build Image') {
            steps {
                script {
                    auth = docker.build("pasilva2023/ingredientes:${env.BUILD_ID}", "-f Dockerfile .")
                }
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