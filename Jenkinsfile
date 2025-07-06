def gv
pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('inint'){
            steps{
                script{
                   gv= load "script.groovy"
                }
            }
        }
        stage('build jar'){
            steps{
                script{
                    gv.buildJar()
                }
            }
        }
        stage('build img'){
            steps{
                script{
                    gv.buildImg()
                }
            }
        }
        stage('deploy'){
            steps{
                script{
                    gv.deploy()
                }
            }
        }
    }
}
