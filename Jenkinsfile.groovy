pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout Git Repository
                git 'https://github.com/M-Usman-Shoaib/firstJava.git'
            }
        }
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
        stage('Deploy') {
            steps {
                bat 'mvn deploy'
            }
        }
    }
}
