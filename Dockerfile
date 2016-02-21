# Pull base image.
FROM anubisdocker/oracle-java:8.60

# Add libs to classpath
ADD build/libs/rest-server.jar /rest-service/rest-service.jar

# describe exposed ports
EXPOSE 8080

# command to run in container
ENTRYPOINT java -jar /rest-service/rest-service.jar


