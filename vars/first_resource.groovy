def call(String name) {
    sh "date" 
    echo "Parameter received: ${name}" 
}
