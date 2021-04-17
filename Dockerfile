FROM alpine:edge
RUN apk update
RUN apk add --no-cache openjdk11
ARG JAR_FILE=/build/libs/*.jar
COPY ${JAR_FILE} myfirst-docker.jar
ENTRYPOINT ["java","-jar","/myfirst-docker.jar"]

