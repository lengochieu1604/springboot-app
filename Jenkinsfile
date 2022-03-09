// def gv

// pipeline{
//     agent any
//     stages{
//         stage('Init'){
//             steps{
//                 script{
//                     gv = load "script.groovy" 
//                 }
//             }
//         }
//         stage('Git clone'){
//             steps{ 
//                 script{
//                     gv.gitClone()
//                 }
//             }
//         }  
//         stage('Maven test'){
//             steps{
//                 script{
//                     gv.mavenTest()
//                 }
//             }
//         }
//         stage('Maven build'){
//             steps{
//                 script{
//                     gv.mavenBuild()
//                 } 
//             }
//         }   
//         stage('Create Dockerimage'){
//             steps{ 
//                 script{
//                     gv.createDockerimage()
//                 }   
//             }
//         } 
//         stage('Run container'){
//             steps{ 
//                 script{
//                     gv.runContainer()
//                 }  
//             }
//         } 
//     }
// }
def gv

pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/shazforiot/HelloWorld-Springboot-App.git' 
                echo "Cloning completed"
            }
        }  
        stage('Maven test'){
            steps{
                sh 'mvn test'
                echo "Testing completed"
            }
        }
        stage('Maven build'){
            steps{
                sh 'mvn package'
                echo "Building completed"
            }
        }
        stage('Create Dockerimage'){
            steps{
                sh 'docker build -t thetips4you/springboot:latest .'
                echo "Building Dockerimage completed"
            }
        } 
        stage('Run container'){
            steps{
                sh 'docker run -d thetips4you/springboot' 
                echo "Running an image inside of a container"
            }
        } 
    }
}
