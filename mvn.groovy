def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  echo pwd()
  dir(pwd()+'/temp')
  if(fileExists('/pom.xml')) {
    echo 'true'
  } else {
    echo 'false'
  }
}
return this
