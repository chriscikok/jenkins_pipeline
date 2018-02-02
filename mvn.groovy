def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  // Run the maven build
  if (isUnix()) {
     sh "'${mvnHome}/bin/mvn' -version"
  } else {
     bat(/"${mvnHome}\bin\mvn" -version/)
  }
}
return this
