node {

    deleteDir()

   stage('Preparation') { // for display purposes
      git 'https://github.com/chriscikok/jenkins_pipeline.git'
      stash includes: '*.groovy', name: "pipeline_code"
   }
   stage('build') {
   unstash name: "pipeline_code"
   def scm = load('scm.groovy')
   def mvn = local('mvn.groovy')
    scm.checkoutGitSourceCode('026422e2-e06c-46ca-aaaf-027bc255ed70', 'https://github.com/chriscikok/temp.git', '*/master')
    mvn.build("temp")
   }
}
