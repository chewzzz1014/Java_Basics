## Spring Beans
- We often need to create different objects in an application to use their functionalities. Some of them need other objects as their dependencies, which in turn require other objects and so on. Spring offers a great way to simplify this huge and complicated chain of creating objects. It can create all the necessary objects during the application startup and put them all in a container. Then each class can retrieve any objects it needs from this container, no more creation and initialization constructions are needed!

- These container-managed objects are known as beans and they organize the backbone of your application. They look exactly like standard Java or Kotlin objects but can be created during the application startup, registered, and then injected into different parts of an application by the container.

- In this topic, we will look at how the Spring IoC container helps us initialize and use beans. We are going to start with the simplest possible example to grasp the basic idea and then gradually make it more complicated. Understanding how DI (Dependency Injection) works is crucial for all further topics in our materials. If you are already familiar with Spring or Spring Boot, the information in this topic may seem quite basic, but we hope you'll learn something new anyway!

## Initial preparations

- Before you start using beans, make sure that you have the basic Spring Boot application.
  - Java
  - Kotlin

- If you don't have it, you can generate it in your IDE or using this website and then follow the explanation here.

- So, to start using beans, we are going to modify this piece of code and the dependency injection mechanism that is the core part of the entire Spring Boot framework.

## Declaring beans

- Beans are usually declared in the classes that have the @Configuration annotation, but it is also possible to declare them in the class containing the @SpringBootApplication annotation. In this lesson, we'll learn how to do it in both of these ways.

- To declare a bean, you need to have a method containing the @Bean annotation. The result of executing this method will be a bean that is managed by the IoC container.

- Here is an example of a simple bean declared in a configuration class:
  - Java
  - Kotlin

- This means that when you start the application, there will be a manageable string bean named address that contains the value "Green Street, 102". Spring automatically invokes the method with the @Bean annotation during the startup in order to initialize all the declared beans.

- By default, beans are singletons. It means that there is only one object for the whole application. But this default behavior can be changed. You will learn more about it in the following topics.

- By default, the name of a bean is the same as the name of the method that produces it. However, the @Bean annotation allows you to rename it not to depend on the name of the method. All you need to do is specify the new name in the annotation, for example @Bean("greenStreet"). In this case, the name of the bean is greenStreet.

## Autowiring beans

- Now that you have declared a bean, you can use it to create other beans that depend on it.

- The Spring IoC container provides the dependency injection (DI) mechanism that allows us to do that. A bean that has a suitable type can be automatically injected into a method annotated with @Bean. There is also the @Autowired annotation that marks a constructor, a field, or a method as to be injected by Spring's DI.

- In this next example, let's introduce an additional class that represents customers.
  - Java
  - Kotlin

- This class includes the address field which we are going to get from our previous bean to create a new Customer object.
- Considering that this is only the first topic about beans, for simplicity, all the following methods will be declared in the class annotated with @SpringBootApplication. However, in real-world applications, you will often see bean-annotated methods declared in @Configuration classes.
- Here is a method that returns an object of this class as a bean. The @Autowired annotation marks the method parameter to be automatically injected.
  - Java
  - Kotlin

- Spring DI injects the address bean into this method and this bean can be used to construct a new object of the Customer class. The injection works because the type of the bean we need is the same as the type of the bean produced earlier, and Spring Container can inject that bean. Even if the argument had another name (e.g. addr), this code would work as expected.

- The @Autowired annotation is not always required to inject a bean. Spring will inject an appropriate bean anyway if a method has the @Bean annotation (or some others). We are always going to explicitly use this annotation in our examples to make the explanation easier for beginners. When you get more experience with Spring, you can decide whether to avoid this annotation.

- You may wonder how we can be sure that both of the methods are invoked and the beans are successfully created. There is no need to introduce any new concepts — we can just create the third temporary bean depending on Customer and print the autowired bean. Add it in the same class where you've put the previous bean.
 - Java
 - Kotlin

- Now if you run the application, you will see the information about the customer in the log.

```
Customer{name='Clara Foster', address='Green Street, 102'}
```

- Keep in mind that Spring prints a lot of log messages, and this info will be among them because beans are initializated during the application startup.

- It means that Spring IoC correctly created all our beans and the beans are injected successfully. 
- There are no restrictions on the number of bean injection points in the code.

## Distinguishing beans of the same type

- As we mentioned before, the location of an injection point is determined by the type of bean. But what if we have several beans of the same type and want to use a particular one? Fortunately, there is the @Qualifier annotation that allows us to specify the name of the bean we need to use.
 - Java
 - Kotlin

- In this example, we specify the name of the bean we need to use to build the customer. The last bean named temporary is created only to print the information during the startup of the application.

- If we deleted the @Qualifier from the customer method, the application wouldn't start and we'd get an error that there are several beans that can be injected:

```
Parameter 0 of method customer in org.hyperskill.beans.DemoSpringApplication 
required a single bean, but 2 were found:
  - address1: defined by method 'address1' in org.hyperskill.beans.DemoSpringApplication
  - address2: defined by method 'address2' in org.hyperskill.beans.DemoSpringApplication
```
- So, if this error occurs, you just need to determine which bean you want to use and apply the @Qualifier annotation.

## Beans vs standard objects

- Now you have a general idea of what Spring beans are and how to use them. But should you always use only beans in Spring and forget about standard objects? The answer is no. You can still use standard objects by creating them manually following the object-oriented programming approach:
 - Java
 - Kotlin

- In real applications, beans are usually used to form a backbone of your app and separate it by layers and configuration files, but most domain objects (like students, accounts, courses, etc.) are standard objects. In this topic, we deliberately used rather synthetic examples to show the logic behind beans without additional complexity. In the following topics, you will encounter a lot of examples where beans are much more convenient than standard objects.

















