def checkoutGitSourceCode (credentialsId_arg, url_arg, branch_arg) {

  checkout ([$class: 'GitSCM',
    branches: [[name: branch_arg]],
    doGenerateSubmoduleConfiguration: false,
    extensions: [[$class: 'SubmoduleOption', disableSubmodules: false, parentCredentials: true, recursiveSubmodules: true, reference: '', trackingSubmodules: true]],
    gitTool: 'GIT',
    userRemoteConfigs: [[credentialsId_arg, url_arg, branch_arg]]
    ]
  )
}
return this
