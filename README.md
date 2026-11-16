# Maven Calculator Demo

A small Java project for demonstrating Maven to beginners.

## Requirements
- JDK 17 or later
- Apache Maven 3.8 or later

## Build from the folder containing pom.xml

```bash
mvn clean
mvn compile
mvn test
mvn package
```

## Run the packaged JAR

```bash
java -jar target/maven-calculator-demo-1.0-SNAPSHOT.jar
```

## What students learn
- Maven project structure and `pom.xml`
- Maven coordinates: groupId, artifactId, version
- Dependency management with JUnit 5
- Compile, test, and package lifecycle phases
- Build output in the `target` directory
