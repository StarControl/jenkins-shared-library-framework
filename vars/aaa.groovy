def call() {
  node {
    stage("manual stage 1"){
      sh '''
        echo "hola"
        '''
    }
  }
}
