# SpringCore - This repo consists of code for the essentials functionality of Spring Core.

## Spring Framework
The Spring is a lightweight framework which is used to develop Java Enterprise application securely, easily and fastly. 
This is very famous among java communities to develop web applications.

## Advantages of Spring
1. This a lightweight framework as it's uses POJO for implementation and does need to use interfaces or abstract classes. 
2. It supports loose coupling due to dependency injections.
3. Dependency injection makes it easy to test.
4. It has some predefined templates like JDBC, JPA etc to ease development work.
5. Spring has many modules which makes it more popular and adopt to use.
6. It provides declarative support like transaction management, connection pulling etc.
7. It has inbuilt services like logging, validating, caching etc.
8. It is a secure framework and supports the faster development of applications. 
9. It supports both XML and annotation-based configurations.
7. It makes code easy to test.

## Spring Modules
1. **Spring Test** - Support of testing
2. **Spring Core** - This contains the core, context, beans and expression language
3. **Spring Aspect** - AOP, Aspect and Instrumentation
4. **Spring Web** - Servlet, Portlet, web and struts
5. **Spring Data Access** - JDBC, ORM, OXM and Transaction

## IoC Container
The IoC Container is responsible for **instantiation of application class, configure object  and to assemble dependencies between objects**.
There are two types of container which are **BeanFactory** and **ApplicationContext**.

## Dependency Injection
Dependency Injection (DI) is a design pattern that removes the dependency from the programming code so that it can be easy to manage and test the application.
Dependency Injection makes our programming code loosely coupled. In such case we provide the information from the external source such as XML file.
It makes our code loosely coupled and easier for testing. There are two types of dependency injection **constructor injection** and **setter injection**.

## Autowiring
Autowiring feature of spring framework enables you to inject the object dependency implicitly. It internally uses setter or constructor injection.
It can't be used to inject primitive and string values. It works with reference only.
