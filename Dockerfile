FROM openjdk:21-jdk
MAINTAINER ESMERALDA
COPY target/EcoTrack-0.0.1-SNAPSHOT.jar EcoTrack.jar
ENTRYPOINT ["java","-jar","/EcoTrack.jar"]
