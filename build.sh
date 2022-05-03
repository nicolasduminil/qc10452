mvn -DskipITs clean install
cd qc10452-ws
mvn -DskipUTs verify
mvn com.oracle.weblogic:weblogic-maven-plugin:redeploy
cd ../qc10452-test
mvn verify