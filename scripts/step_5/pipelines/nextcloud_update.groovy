pipeline {
    agent any
    
    // this pipeline updates the Nextcloud container

    stages {

        stage('Docker Compose Operations') {
            steps {
                    // Perform docker-compose commands
                    sh '''
                        cd /home/cloudy/nextcloud_infra
                        docker compose --project-name cloudy pull
                        docker compose --project-name cloudy down
                        docker compose --project-name cloudy up -d
                    '''
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution complete.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
