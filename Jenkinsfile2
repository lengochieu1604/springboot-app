pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git branch: 'main', url: 'https://github.com/lengochieu1604/springboot-app'
            }
        }
        stage('Maven Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Maven Build'){
            steps{
               sh 'mvn package'
            }
        } 
        stage('Maven Deploy'){
            steps{
                echo "Deploying the war file to the server"
            }
        }
    }
}
