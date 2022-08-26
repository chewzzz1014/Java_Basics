## Java Archive
- Java Archive (JAR) is a platform-independent file format to pack multiple files together and distribute them as a single unit. So it comes in handy if your application contains lots of files.
- These are the main benefits of a JAR file:
  - it can aggregate multiple files of different types;
  - it is a compressed archive (with a ZIP algorithm) that reduces the size of the application and makes it easier to move it over a network;
  - you can digitally sign it (this feature won't be discussed in this topic).

- A JRE can start an application packed into a JAR, but to create a JAR you need to use a JDK.

## The structure of a JAR file
- A JAR file is simply an aggregation of bytecode files (.class), configuration files (e.g., .json, .xml), images, and even sound clips into a single compressed file. 
- All files except bytecode files are usually called resources. It is also recommended that a JAR file contains a special file named MANIFEST.MF in a special folder named META-INF. This file should describe the JAR file itself (a manifest is a kind of metadata): its version, the author, and so on.
- Here is the example of a structure of a JAR file:

```
example.jar
├── META-INF
│   └── MANIFEST.MF
├── second
│   ├── Main.class
│   └── MyIcon.png
└── third
    └── another
        └── OneMore.class
```

- Usually, a JAR file has a set of .class grouped by packages. For now, just imagine a package simply as a directory or some nested directories. In our example, there are two packages: second and third/another. Also, to represent a specific package name dots are used instead of slashes (so third.another notation would be correct in this case). Finally, there are some rules for naming the packages. For instance, a name can contain letters and digits, but no hyphens (-).
- As you can see, JAR may have several packages and many .class files and/or resources in these packages.
- The manifest file has a set of headers. The name and the value are separated by a colon (:). Take a look at a small example below:
```
Manifest-Version: 1.0
Created-By: 9.0.1 (Oracle Corporation)
Main-Class: second.Main
```
- The key feature here is the optional header Main-Class that defines the relative path of a class with the main method to start the application. The value shouldn't have the .class extension appended to the class name.
- It's important to remember that the last line of the manifest file should end with a new line or a carriage return, or it will not be parsed properly.

## Running a JAR file
- There are two ways to run a JAR file, depending on whether you want to use Main-Class header in the manifest file or not.
- if this header is not present or you want to specify the main class manually, run:
```
java -cp <app-without-main-class-header.jar> <path.to.Main>
```
- The last parameter here is the full class name (with packages). The -cp option means classpath i.e. paths to all the JARs which the JRE should scan for bytecode and resources. If you want, you can repeat multiple -cp path-to-Nth.jar pairs of parameters to provide the JRE with multiple different JAR files.
- if this header is present, then run:
```
java -jar <app-with-main-class-header.jar>
```
- You can try executing both commands locally with these two JAR files (unpack top-level archives):
  - [a demo application without Main-Class header](https://stepik.org/media/attachments/lesson/123928/app1.zip) (path to main is myapp.Main);
  - [a demo application with Main-Class header](https://stepik.org/media/attachments/lesson/123928/app2.zip)
- Both of them print the same line:
```
Hello, Java
```
- Also, you can find some JAR files on the Internet and try running those. At the same time, you can view their internal structure – just replace .jar with .zip and open these files as archives.

## Running jar On Windows 10

1. jar file w/o main file header
- In this case, I downloaded app1.zip. After unzipped, inside the app1 folder has app1.jar.
- To run the jar file, I cd into the `app1` directory which stores the app1.jar
- Enter command:

![image](https://user-images.githubusercontent.com/92832451/186912899-8c58154c-84dc-4533-a2f1-8af293923757.png)

2. jar file with main file header (no need to specify path to main)

![image](https://user-images.githubusercontent.com/92832451/186914127-5d62f231-4c1d-4cb3-804f-2dd964410e94.png)

