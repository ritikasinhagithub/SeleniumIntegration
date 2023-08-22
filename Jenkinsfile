pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages {
        stage('Get Source Code') {
            steps {
             
               echo 'git cloned'
            }
        }
        stage('build')
        {
            steps{
               
              
                echo 'comiled'
              
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
