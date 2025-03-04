def call() {
   
    def content = libraryResource 'bash.sh'
    
    writeFile file: 'list.sh', text: content
    
    sh "ls -l ./list.sh"
    
    sh "bash ./list.sh"
}
