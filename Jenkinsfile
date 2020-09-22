pipeline {
     tools{
        jdk 'Java8'
        maven 'Maven_Local'
    }
    agent any 
    stages {
        
        stage('checkout'){
          
            steps{
                git 'https://github.com/munirahmad900/todo-service.git'
            }
        }
        stage('compile'){
            
            steps{
                bat 'mvn compile'
            }
        
        }
        stage('test'){
           
            steps{
            bat 'mvn test'
            }
        }
        
        stage('package'){
           
            steps{
            bat 'mvn package'
            }
        }
        
    }
}