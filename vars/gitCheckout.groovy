def call(map stageparams){
    checkout([
        $class: 'gitSCM',
        brances: [(name: stageparams.branch)],
        userRemoteConfis: [( url: stageparams.url)
        ]
            ])
}