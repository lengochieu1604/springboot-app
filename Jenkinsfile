def gv

pipeline {
    agent any
    stages {
        stage('Init') {
            steps {
                gv = load 'script.groovy'
            }
        }
        stage('Git clone') {
            steps {
                gv.gitClone()
            }
        }
        stage('Maven test') {
            steps {
                gv.mavenTest()
            }
        }
        stage('Maven build') {
            steps {
                gv.mavenBuild()
            }
        }
        stage('Create Dockerimage') {
            steps {
                gv.createDockerimage()
            }
        }
        stage('Run container') {
            steps {
                gv.runContainer()
            }
        }
    }
}
// def gv

// pipeline{
//     agent any
//     stages{
//         stage('Git clone'){
//             steps{
//                 git 'https://github.com/shazforiot/HelloWorld-Springboot-App.git'
//                 echo "Cloning completed"
//             }
//         }
//         stage('Maven test'){
//             steps{
//                 sh 'mvn test'
//                 echo "Testing completed"
//             }
//         }
//         stage('Maven build'){
//             steps{
//                 sh 'mvn package'
//                 echo "Building completed"
//             }
//         }
//         stage('Create Dockerimage'){
//             steps{
//                 sh 'docker build -t thetips4you/springboot:latest .'
//                 echo "Building Dockerimage completed"
//             }
//         }
//         stage('Run container'){
//             steps{
//                 sh 'docker run -d thetips4you/springboot'
//                 echo "Running an image inside of a container"
//             }
//         }
//     }
// }
