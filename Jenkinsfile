node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/chriscikok/temp.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.
      mvnHome = tool 'M3'
   }
   stage('Version') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -version"
      } else {
         bat(/"${mvnHome}\bin\mvn" -version/)
      }
   }
}
