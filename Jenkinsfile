pipeline
{
    agent any
        stages
        {
            stage('checkout')
            {
                steps
                {
                    echo"Cloning repo..."
                    git branch:'main ',url:'https://github.com/zuhasana/CICDweek5.git'

                }
            }
            stage('Compile')
            {
                steps
                {
                    echo"Compile"
                    bat'javac Factorial.java TestFactorial.java'
                }
            }
            stage('Test')
            {
                steps
                {
                    echo"Test"
                    bat'java TestFactorial'
                }
            }
            stage('Run')
            {
                steps
                {
                    echo'Run'
                    bat 'java Factorial'
                }
            }
        }
    
}