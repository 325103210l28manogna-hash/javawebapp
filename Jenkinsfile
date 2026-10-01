pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t javawebapp .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker rm -f javawebapp2 2>NUL || exit /b 0'
                bat 'docker run -d -p 8081:8080 --name javawebapp2 javawebapp'
            }
        }
    }
}
