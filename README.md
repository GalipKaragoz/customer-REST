# customer-REST
Code Challenge Web Service created in Spring Boot

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.bibek.customersvc.CustomesvcApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Endpoints

- `GET`  `/customers`  Returns all customers
- `GET`  `/customers/{id}`  Get customer by Id
- `GET`  `/customers/search?name={query}`  Search customer by Name
- `POST`  `/customers`  Add Customer
- `PUT`  `/customers/{id}` Update Customer
- `DELETE`  `/customers/{id}` Delete Customer
