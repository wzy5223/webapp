FROM java:8u111-jre-alpine

COPY target/webapp*.jar webapp.jar

CMD ["java","-jar","webapp.jar"]


