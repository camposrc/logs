def call() {
    git credentialsId: '', branch: '', 'https://github.com/jenkinsci/git-plugin'
    list = sh 'ls -lh'
    return list
}
