node {

    deleteDir()
    def scm
    def mvn

   stage('Preparation') { // for display purposes
      git 'https://github.com/chriscikok/jenkins_pipeline.git'
      scm = load('scm.groovy')
      mvn = load('mvn.groovy')
   }
   stage('checkout') {
    scm.checkoutGitSourceCode('	026422e2-e06c-46ca-aaaf-027bc255ed70', 'https://github.com/chriscikok/temp.git', '*/master')
   }
   stage('build') {
    mvn.build('temp')
   }
}
