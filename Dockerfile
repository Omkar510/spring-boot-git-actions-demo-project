FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-github-actions-project.jar spring-boot-github-actions-project.jar
ENTRYPOINT [ "java", "-jar", "spring-boot-github-actions-project.jar" ]