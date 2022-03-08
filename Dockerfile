FROM openjdk:11
WORKDIR /usr/src/app
COPY ./build/libs/estock-zuul-gateway-0.0.1-SNAPSHOT.jar estock-zuul-gateway-0.0.1-SNAPSHOT.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar", "estock-zuul-gateway-0.0.1-SNAPSHOT.jar"]
