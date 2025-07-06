def buildJar(){
    echo "building jar"
    sh "mvn package"
}
def buildImg(){
    echo "building img"
    withCredentials([usernamePassword(credentialsId:'docker-hub', passwordVariable: 'PASS',usernameVariable:'USER')]){
        sh "docker build -t ashutoshbhardwaz/maven-build-app:2.1 ."
        sh "set +x && echo $PASS | docker login -u $USER --password-stdin "
        sh "docker push ashutoshbhardwaz/maven-build-app:2.1  "
    }
}
def deploy(){
    echo 'deployin this aplication'
}
return this
