## Getting started with Spring Boot 
In this topic, you will learn how to create your first Spring Boot application. This application is quite simple and does nothing useful, but still, it will demonstrate the basic structure of any Spring Boot project.

## Generating a Spring Boot application

It is often hard to start a new project from scratch, especially for a beginner. You need to set up the basic structure, create configurations and manage all external dependencies. Fortunately, there is a special web site called [Spring Initializr](https://start.spring.io/) that can generate the basic Spring Boot project based on your wishes.

This site may look slightly different, but the general idea remains the same. There are several important options you need to specify before generating a project:

- the build tool: Maven or Gradle
- one of the possible JVM-based languages: Java (8, 11 or higher), Kotlin, Groovy
- a version of Spring Boot framework (e.g, the last released version without SNAPSHOT, M and other suffixes).
- metadata like group, artifact, description and package name
- external dependencies (other frameworks and libraries)

If you are interested in the naming rules for Spring Boot versions and the meaning of the diverse suffixes, you can read this short article.

In our example, we've chosen Gradle as the build tool and Java 11 as the language. You can choose a more recent version if you'd like. Our application is named demo.

By default, the packaging type for Spring Boot is Jar. It means that your application should be packed in a .jar file that contains all the required dependencies. This type of file is more simple to use than a .war file, which should be deployed on an external application server.

After you've chosen all the necessary settings and dependencies, just click Generate Project to get the project's archive. This archive contains the basic structure of a typical Spring Boot application without application logic; it is just a template, you need to write some logic there.


## Running the application
Although the generated application is useless at the moment, it is a good template to start with.

Let's run it! First, unpack the application and then visit the project's directory. In our examples, we will use Gradle as it is a common build automation system.

First, we should build the application:

```
./gradlew build
```

It creates a .jar file using Gradle Wrapper and puts it in the build/libs/ directory. Gradle automatically downloads all the necessary dependencies while building.

When finished, it should print:

```
BUILD SUCCESSFUL in 1s
```

![image](https://user-images.githubusercontent.com/92832451/187456985-77bb182b-79a9-4ff8-a496-3ee6c1ea51af.png)


![image](https://user-images.githubusercontent.com/92832451/187457222-f45fe974-6234-4cd1-a7c6-0b7ffd42e003.png)



Now, it is time to run the program represented as a .jar file.

```
java -jar build/libs/*.jar
```

After running, this application just prints the Spring logo and several log lines that we skipped.

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.4)
```
You may also build and start an application using a single line:

![image](https://user-images.githubusercontent.com/92832451/187457615-341cf590-9dea-4502-99b1-2c0a0afe4fb8.png)



```
./gradlew build && java -jar build/libs/*.jar
```

Congratulations! You've just created and started your first application using the Spring Boot framework even without a single line of code, except for a pair of commands.


