pipeline {
    agent any
    parameters {
        choice(name: 'Select', choices: ['alpha', 'dev', 'production'])
    }
    stages {
        stage('Build') {
            steps {
                script {
                    if (params.Select.trim() == '') {
                        echo "Parameter is blank. Not preparing the build."
                        currentBuild.result = 'FAILURE'
                        error("Parameter is blank")
                    }
                }
            }
        }
    }
} 