def call(Map stageParams){
    checkout([
        $class: 'gitSCM',
        branches: [(name: stageparams.branch)],
        userRemoteConfigs: [( url: stageparams.url)]
            ])
}

