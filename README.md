# WELCOME
This repo is a package of exercises to get used to Maven & Spring DI.

Each branch will be an independent exercise to help you get familiar with common tasks that you will face on a daily
basis when working with Maven & Spring.

# Getting Started
## Maven Wrapper
This project is configured with a Maven wrapper.

Normally, to use Maven, you need to install Maven on your environment.

Thanks to wrapper such as the one included in this project, manual & separate installation is no longer needed.

The wrapper will automatically download the specified version, and use it to build the project.

The downloaded binaries are:
1. Cached, so subsequent invocations will not download again the same version.
2. Only available for this project, when the wrapper is invoked.

So. with wrappers, it's possible to have multiple projects using different versions of a same build tool.

## Build the Project
Run a complete Maven build by:

```./mvnw clean install```

This will:
1. Clean
2. Compile the project
3. Run available tests
4. Install the built packages to local repository

## Run the project
This is a Spring Boot application, so:

```./mvnw spring-boot:run```

You can try your application by visiting ```localhost:8080``` & ```localhost:8080/items```

# Exercise 02
Add a dependency to [Apache Commons Collections](https://mvnrepository.com/artifact/org.apache.commons/commons-collections4/4.4)

Replace the ```null``` & empty check in ```BusinessPresentation``` with a null-safe empty check in
[```CollectionUtils.isEmpty```](https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/CollectionUtils.html#isEmpty-java.util.Collection-)