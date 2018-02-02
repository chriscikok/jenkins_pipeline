def build(project_folder_arg) {
  def mvnHome = tool 'M3'
  sh "'ls -l ' project_folder_arg"
}
return this
