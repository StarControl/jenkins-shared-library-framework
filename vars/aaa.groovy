def call() {
  stage("manual stage 1"){
    sh '''
      echo "hola"
      '''
  }
}
