FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/EcoTrack-0.0.1-SNAPSHOT.jar EcoTrackBackend.jar
ENTRYPOINT ["java","-jar","/EcoTrackBackend.jar"]
