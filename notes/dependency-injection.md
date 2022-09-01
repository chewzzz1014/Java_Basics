## Dependency injection 
When working with OOP, you may have noticed certain relations between objects. Often, these relations need to be structured, described, and properly utilized. One way to do this is by using dependency injection. What is dependency injection? Well, let's try to answer this question.

## Dependency and dependency injection

First, what is a dependency? It's a relation between two classes in which one class uses the functionality of the other class, i.e. one class is dependent on the other.

![image](https://user-images.githubusercontent.com/92832451/187910677-0fcd1570-68a8-448f-83fe-c75c9f09fe44.png)

In OOP, dependencies appear in the form of instance creation inside a class. Through this instance, one class can access the methods of another class. This way classes become dependent. Here's an example in pseudocode:

```
class Injector is
  method function()

class Dependent is
  Injector instance = new Injector()

  method function() is
    instance.function()
```

Dependency injection or DI is the process of transferring the task of object creation to other parts of code. This means making a dependency that you can use. This allows the creation of loose coupling in our code.

There is no agreed point on whether DI is considered a design pattern or not. Considering this as an introduction to DI, the explanation is simplified. This makes it more subjective and debatable. So, for more context, you should learn more about DI and look into inversion of control (IoC) and design patterns to form your own opinion.

## DI example

In the first snippet, the Dependent class relies on the Injector class. With this dependency, you cannot use different types of Injector. Its instance is constructed inside Dependent, so you can't use different variations of it. Also, you can't test different Injector instances.

To overcome this, let's try to use one type of DI on this code:

```
interface Injector is
  method function()


class Example implements Injector is
  method function() is ...
  ...


class Dependent is
  Example instance

  method useInstance(Injector instance) is
    instance.function()
```
Now, Dependent relies on the interface instead of a class. There are two classes that use our Injector interface as a pattern and build different implementations. Object creation is now moved to other classes and the interface provides Dependent with different implementations. You can also set the implementation you want to access through the useInstance() method.

But this is just the tip of the iceberg. There are different types of dependency injection that you need to take into consideration.

## Types of injection

There are three main types of DI. Let's look at them.

- Method(Interface) Injection — dependencies are passed through methods that the class can access via interface or another class. The previous snippet of pseudocode was an example of method injection.

- Property(Setter) Injection — dependencies are passed through a separate setter method. Implementation of this injector varies depending on the language. Here is a bare-bones example of this injection in pseudocode: 

```
class Injector is
  Example example
  
  method getEx() is
    return example

  method setEx(Example ex) is
    example = ex


class Dependent is
  Injector inj = new Injector()
  inj.setEx(new Example())
  inj.getEx()
```
Depending on the language, you can work with the set method in different ways. For example, in Java; using Spring annotations, you can include parameters from config files into the set method. However, this pseudocode is meant to be as simple as possible.

- Constructor injection — dependencies are provided through the constructor class. An example of this injector is depicted in this pseudocode: 

```
class DI is
  Injector constructor
  
  constructor of DI(Injector cons) is
    constructor = cons
 
  method function() is ...


class Dependent is
   DI example = new DI(new Injector())
   example.function()
```

## Why do we need DI?

DI allows us to make code, parts of which are less interdependent on each other. Through DI we can release some classes from the object creation process and pass it to injectors that can provide said objects. This way, one class will know nothing about the object creation process in the other. It allows you to reuse dependent classes without adjustment for each new instance of an object.

This comes in handy when you need to extend and modify your code. But, it also can also improve your testing process. With DI, you can provide different instances with different tweaks of the same object, you can test how your code will react to it.

But, there are some disadvantages to DI. This can be addressed to the complexity of its implementation. It includes the steep learning curve for DI, problems caused by the overuse of DI, and troubles implementing DI with different frameworks and libraries.
