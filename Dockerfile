FROM openjdk:11

ADD build/libs/scheduler-service.jar.jar schedulerapp.jar
ENTRYPOINT [ "java","-jar","schedulerapp.jar" ]
EXPOSE 8080
