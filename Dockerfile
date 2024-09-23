FROM openjdk:21.0.2-jdk-alpine
MAINTAINER ESMERALDA
COPY target/EcoTrack-0.0.1-SNAPSHOT.jar EcoTrackBackend.jar
ENTRYPOINT ["java","-jar","/EcoTrackBackend.jar"]
