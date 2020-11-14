# Spring boot with react app

Build spring boot and react in single jar file

## Command
```sh
mvn clean install # build jar file
tree target/classes # check target folder
jar tvf target/spring-boot-with-react-app-0.0.1-SNAPSHOT.jar| grep public # check jar file
java -jar target/spring-boot-with-react-app-0.0.1-SNAPSHOT.jar # run application
```

## Plugin
- `frontend-maven-plugin` create production build of react app (prefer to use `yarn`)
- `maven-antrun-plugin` copy the production build into `${target/classes/public}`

## Links
- https://blogg.kantega.no/webapp-with-create-react-app-and-spring-boot/
- https://swissquote.github.io/crafty/User_Guides/Configuring_the_build_in_a_maven_project.html