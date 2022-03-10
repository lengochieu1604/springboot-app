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
return this

