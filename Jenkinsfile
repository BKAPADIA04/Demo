pipeline {
    agent any

    environment {
        IMAGE_NAME = "bkapadia04/calculator"
        IMAGE_TAG  = "latest"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/BKAPADIA04/Demo.git'
            }
        }

        stage('Check Docker') {
            steps {
                echo 'Checking Docker version...'
                sh '''
                    docker --version
                '''
            }
        }

    }
}
