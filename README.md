# springboot-rest-with-security
A simple spring boot application having Rest endpoint secured with spring security

In this example I will explain how to build Restful Webservices step by step from ground using Spring boot and Java.

Prerequisite : Basic knowledge on Core java, Annotations and SOA

Step 1: Web dependencies in pom.xml

<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
</dependency>

This dependency would add required web application JAR's supporting annotations like @RestContoller, Servletinitializer etc.

<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
</dependency>

This would make sure to secure the rest endpoints defined in @RestController
I have used in-built tomcat dependency to test the app, during the server start up spring will generate random password, can be found 
during server start up logs. use it to login/accessing the endpoint. user: USER

Step 2: Data storage

In this example i have used H2 database which is a popular in memory database which is best used with Spring boot

To enable it add below dependency 
<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
</dependency>

Using spring data JPA - entities and repositories Java classes we can persist the data into database.

Step 3 : Creating rest endpoint

To define the endpoints like POST, GET etc annotate the class with @RestController and define corresponding methods as required

@GetMapping - to define GET endpoint
@PostMapping - to define POST endpoint
