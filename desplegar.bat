cmd /c "kill_port 8001" & cmd /c "kill_port 8080" & cmd /c "kill_port 9001" 
cmd /c "mvn clean package"
cd target
java -jar simpleweb-0.0.1-SNAPSHOT.jar
// spring-boot:run --spring.profiles.active=test