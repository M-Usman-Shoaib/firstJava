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
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
