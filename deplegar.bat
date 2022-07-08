kill_port 8001 & mvn package 
java -jar simpleweb-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
// spring-boot:run --spring.profiles.active=test