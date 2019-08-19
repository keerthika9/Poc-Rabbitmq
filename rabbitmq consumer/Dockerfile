FROM openjdk:11
ADD ./target/rabbitmq-0.0.1-SNAPSHOT.jar /usr/src/rabbit-mq-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","rabbit-mq-0.0.1-SNAPSHOT.jar"]
