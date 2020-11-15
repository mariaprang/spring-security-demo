# Spring Security Demonstration

This project is a demonstration for Login functionality with Spring Security. 

## Step 1 - Set up the project dependencies

When working with Spring Boot, the spring-boot-starter-security starter will automatically include all dependencies such as spring-security-core, spring-security-web and spring-security-config among others:

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
    <version>2.3.3.RELEASE</version>
</dependency>
```

Except for the one above, make sure to also include the following dependencies:

* ```H2 Database``` - An in-memory database to store Users 
* ```Spring Web``` 
* ```Spring DevTools``` 
* ```Thymeleaf``` 


## Step 2 - Project structure

A project structure in ```src/main``` involving the following packages recommended: model, controller, repository, service, config

* ```model``` - containing User and BaseEntity
* ```repository``` - containing UserRepositoryInteface
* ```service``` - containing UserDetailsServiceImpl and UserDetailsService
* ```controller``` - containing LoginController
* ```config``` - containing InitialData and WebSecurityConfig
