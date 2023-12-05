FROM openjdk:11
VOLUME /tmp
ENV IMG_PATH=/img
EXPOSE 8080
RUN mkdir -p ${IMG_PATH}

ADD target/apigym-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
