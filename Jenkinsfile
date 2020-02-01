pipeline {
   agent any

   stages {
      stage('Build') {
         steps {
            checkout scm
            sh "./gradlew clean build printcp"
         }

         post {
            success {
               metrics filePattern: '**/src/**/java/**/*.java', classPathFile: 'cp.txt'
               recordIssues(tools: [checkStyle(pattern: '**/checkstyle/*.xml'), java(), pmdParser(pattern: '**/pmd/*.xml')])
               publishCoverage adapters: [jacocoAdapter('**/target/reports/jacoco/test/jacocoTestReport.xml')], sourceFileResolver: sourceFiles('NEVER_STORE')
            }
         }
      }
   }
}