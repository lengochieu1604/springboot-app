def gitClone(){
    git 'https://github.com/shazforiot/HelloWorld-Springboot-App.git' 
    echo "Cloning completed"
}
def mavenTest(){
    sh 'mvn test'
    echo "Testing completed"
}
def mavenBuild(){
    sh 'mvn package'
    echo "Building completed"
}
def createDockerimage(){
    sh 'docker build -t thetips4you/springboot:latest .'
    echo "Building Dockerimage completed"
            
}
def runContainer(){ 
    sh 'docker run  thetips4you/springboot' 
    echo "Running an image inside of a container."       
}
return this

