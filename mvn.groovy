def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  echo pwd()
  dir(pwd()+'/temp')
  fileExists('/pom.xml')
}
return this
