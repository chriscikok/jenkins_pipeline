def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  echo pwd()
  dir(pwd()+'/'+${project_folder_arg})
  def exist = fileExists 'pom.xml'
  echo exist
}
