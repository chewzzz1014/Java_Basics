## Building apps using Gradle 
 We hope you already got a basic understanding of what Gradle is and how to use it. In this topic, we will consider the basic structure of the build.gradle file, and then build and run a small application. The knowledge you obtain here can be used for any JVM-based programming language supported by Gradle (e.g. Java or Kotlin).

This article was written using Gradle 6.8.1. There may be some differences for other versions of Gradle. If you have trouble with this article, you can read the comments or just follow the official Gradle doc instead of this.

## Initializing an application
We assume that you already have some experience with the terminal of your operating system and will interact with Gradle using it. First of all, create a new empty folder named what you want (e.g., demo). In this folder, you need to invoke the gradle init command to start initializing a new Gradle-based project. This command will show you a dialogue form to set up the project you need.

In this form, choose application as the type of the project; Java or Kotlin as the implementation language; and org.hyperskill.gradleapp as the project name if you would like to precisely follow our example (but it isn't required). For all other questions, you can choose their default options, since it doesn't matter now.

Below is an example of choosing options.

```
Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

Split functionality across multiple subprojects?:
  1: no - only one application project
  2: yes - application and library projects
Enter selection (default: no - only one application project) [1..2] 

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit 4) [1..4]  

Project name (default: demo): org.hyperskill.gradleapp
Source package (default: org.hyperskill.gradleapp): 
```
After the initialization is completed, the project structure will be the following:

```
.
├── app
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── org
│       │   │       └── hyperskill
│       │   │           └── gradleapp
│       │   │               └── App.java
│       │   └── resources
│       └── test
│           ├── java
│           │   └── org
│           │       └── hyperskill
│           │           └── gradleapp
│           │               └── AppTest.java
│           └── resources
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```


