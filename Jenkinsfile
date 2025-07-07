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
             when{
                        expression{env.BRANCH_NAME =='master'}
                    }
            steps{
                script{
                    gv.buildJar()
                }
            }
        }
        stage('build img'){
             when{
                        expression{env.BRANCH_NAME =='master'}
                    }
            steps{
                script{
                    gv.buildImg()
                }
            }
        }
        stage('deploy'){
             when{
                        expression{env.BRANCH_NAME =='master'}
                    }
            steps{
                script{
                    gv.deploy()
                }
            }
        }
    }
}
