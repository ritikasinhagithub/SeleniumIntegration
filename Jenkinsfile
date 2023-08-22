pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages {
        stage('Get Source Code') {
            steps {
               git branch: 'master', url: 'https://github.com/Mukesh-50/mavenjenkins.git'
               echo 'git cloned'
            }
        }
        stage('build')
        {
            steps{
                bat 'dir'
                bat 'mvn compile'
                echo 'comiled'
                bat 'mvn build'
            }
        }
        stage('test')
        {
            steps{
               echo 'testting'
            }
        }
    }
}
