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
                when{
                        expression{
                            env.BRANCH_NAME =='master'}
                    }
                script{
                    gv.buildJar()
                }
            }
        }
        stage('build img'){
            steps{
                 when{
                        expression{
                            env.BRANCH_NAME =='master'}
                    }
                script{
                    gv.buildImg()
                }
            }
        }
        stage('deploy'){
            steps{
                 when{
                        expression{
                            env.BRANCH_NAME =='master'}
                    }
                script{
                    gv.deploy()
                }
            }
        }
    }
}
