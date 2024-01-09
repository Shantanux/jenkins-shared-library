def call(Map stageParams){
    checkout([
        $class: 'SCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[url: stageParams.url]]
            ])
}

