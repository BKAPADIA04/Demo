pipeline {
    agent any

    environment {
        IMAGE_NAME = "bkapadia04/calculator"
        IMAGE_TAG  = "latest"
    }

    // Add extra PATH so Jenkins finds docker and sh
    options {
        envVar(name: 'PATH+EXTRA', value: '/usr/local/bin')
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/BKAPADIA04/Demo.git'
            }
        }

        stage('Check Docker') {
            steps {
                sh '''
                    if ! command -v docker &> /dev/null
                    then
                        echo "❌ Docker CLI not found. Please install Docker."
                        exit 1
                    fi
                    docker --version
                '''
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials',
                                                 usernameVariable: 'DOCKER_USER',
                                                 passwordVariable: 'DOCKER_PASS')]) {
                    sh '''
                        echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin
                        docker push ${IMAGE_NAME}:${IMAGE_TAG}
                    '''
                }
            }
        }
    }

    post {
        success {
            echo "✅ Pipeline completed successfully! Image pushed to Docker Hub: ${IMAGE_NAME}:${IMAGE_TAG}"
        }
        failure {
            echo "❌ Pipeline failed! Please check the logs."
        }
    }
}
