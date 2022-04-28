mvn -DskipITs clean install
cd qc10452-ws
mvn com.oracle.weblogic:weblogic-maven-plugin:redeploy
cd ../qc10452-client
mvn verify