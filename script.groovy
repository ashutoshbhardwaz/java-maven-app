def buildJar(){
    echo "building jar"
    sh "mvn package"
}
def buildImg(){
    echo "building img"
    withCredentials([usernamePassword(credentialId:'docker-hub',usernameVariable:'USER', passwordVariable: 'PASS')]){
        sh "docker build -t ashutoshbhardwaz/maven-build-app:2.1 ."
        sh "echo $PASS | docker login -u $USER --password-stdin "
        sh "docker push ashutoshbhardwaz/maven-build-app:2.1  "
    }
}
def deploy(){
    echo 'deployin this aplication'
}
return this
