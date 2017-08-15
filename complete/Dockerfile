FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/gs-accessing-data-mongodb-0.1.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dspring.data.mongodb.uri=mongodb://172.17.0.2/test -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
