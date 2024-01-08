def call(Map stageParams){
    checkout([
        $class: 'gitSCM',
        branches: [(name: stageparams.branch)],
        userRemoteConfis: [( url: stageparams.url)
        ]
            ])
}

s