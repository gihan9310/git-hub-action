FROM openjdk:11
EXPOSE 8090 8000
ADD target/*.jar app.jar
ADD entrypoint.sh entrypoint.sh
ENTRYPOINT ["sh","/entrypoint.sh"]

