def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  stage ('build') {
    sh "'cd ' project_folder_arg"
    sh "ls -ls"
  }
}
return this
