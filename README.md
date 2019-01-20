# Simple Spring Boot Application

## Requirements
- Git
- Maven

## Clone
- cd /opt/
- git clone https://github.com/nWmCZ/SpringBoot21HelloWorld.git
- cd SpringBoot21HelloWorld

## Build JAR
- mvn clean install

## Run JAR
- java -jar ./target/SpringBoot21HelloWorld-0.1-SNAPSHOT.jar

## Build Docker image from JAR
docker build . -t novst/springboot21helloworld

## Build WAR
- mvn clean install -P war
- deploy WAR to Tomcat

## Build Docker image from WAR
docker build . -t novst/springboot21helloworldwar -f DockerfileWAR

## Labeling
- http://label-schema.org/rc1/

## MicroBadges
- https://microbadger.com/

## Hooks and automated build
- https://docs.docker.com/docker-hub/builds/#create-an-automated-build
- https://docs.docker.com/docker-cloud/builds/advanced/#custom-build-phase-hooks
