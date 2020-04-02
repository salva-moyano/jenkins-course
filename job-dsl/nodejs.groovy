job('NodeJS example') {
    scm {
        git('git://github.com/salva-moyano/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('smoyano')
            node / gitConfigEmail('salvamoyanopalma@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
