def call(Map stageParams){
    checkout([
        $class: 'gitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[url: stageParams.url]]
            ])
}

