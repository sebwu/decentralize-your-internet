pipeline {
    agent {
       label "hamster"
       // this pipeline updates the server
       // reboot is not always necessary
       // however for a family setup, neither is downtimeless patching ;-)
       // take note that this here requires credentials managed in jenkins 
       // check detail_guides/4.2-add_jenkins_pipelines.md for more information
       // here you need the sudo credentials
       // the required credentials are of the type "secret text"
    }
    options {
        lock resource: 'app'
    }
    stages {
        stage('update') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'unimatrix_herdenadmin_pw', usernameVariable: 'SUDO_USER', passwordVariable: 'SUDO_PW')]) {
                sh 'echo $SUDO_PW | sudo -S apt update'
                }
            }
        }
        stage('upgrade') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'unimatrix_herdenadmin_pw', usernameVariable: 'SUDO_USER', passwordVariable: 'SUDO_PW')]) {
                sh 'echo $SUDO_PW | sudo -S apt-get upgrade -y'
                }
            }
        }
        stage('reboot') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'unimatrix_herdenadmin_pw', usernameVariable: 'SUDO_USER', passwordVariable: 'SUDO_PW')]) {
                sh 'echo $SUDO_PW | sudo -S shutdown -r 1'
                }
            }
        }
    }
}
