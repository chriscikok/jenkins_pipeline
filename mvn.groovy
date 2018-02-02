def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  def curPath = pwd()
  dir("${curPath}/${project_folder_arg}")
  def exist = fileExists 'pom.xml'
  echo exist
}
return this
