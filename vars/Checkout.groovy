def call() {
    git 'https://github.com/jenkinsci/git-plugin'
    list = sh 'ls -lh'
    return list
}
