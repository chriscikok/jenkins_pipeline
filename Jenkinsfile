node {

    deleteDir()


   stage('Preparation') { // for display purposes
      git 'https://github.com/chriscikok/jenkins_pipeline.git'

   }
   stage('Version') {
      def mvnHome
      mvnHome = tool 'M3'
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -version"
      } else {
         bat(/"${mvnHome}\bin\mvn" -version/)
      }
   }
   stage('checkout') {
    def scm = load('scm.groovy')
    scm.checkoutGitSourceCode('	026422e2-e06c-46ca-aaaf-027bc255ed70', 'https://github.com/chriscikok/temp.git', '*/master')
   }
   stage('build') {
    def mvn = load('mvn.groovy')
    mvn.build('temp')
   }
}
