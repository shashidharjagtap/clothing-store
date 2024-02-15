pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package' // Assuming you use Maven for building
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Docker Build & Push') {
            steps {
                script {
                    docker.build("clothing-store")
                    docker.withRegistry('https://dockerhub.example.com', 'dockerhub-credentials') {
                        docker.image("clothing-store").push()
                    }
                }
            }
        }
    }
}

