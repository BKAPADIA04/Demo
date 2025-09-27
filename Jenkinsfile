pipeline {
    agent any

    environment {
        IMAGE_NAME = "bkapadia04/calculator"
        IMAGE_TAG  = "latest"
        // Ensure Docker path is included
//         PATH = "/usr/local/bin:$PATH"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/BKAPADIA04/Demo.git'
            }
        }

        stage('Check tools') {
                    steps {
                        echo 'Checking Docker and Docker Compose versions...'
                        sh '''
                        docker version
                        docker compose version
                        '''
                    }
                }
    }
}
