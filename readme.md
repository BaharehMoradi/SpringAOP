# Spring AOP Sample Application

This is a sample Spring Boot application that demonstrates the usage of Aspect-Oriented Programming (AOP) in combination with Spring's component scanning.

## Prerequisites

- Java Development Kit (JDK) 19
- Maven build tool 3.9.3

## Application Overview

The application consists of the following components:

- `SampleController`: This class defines two RESTful API endpoints and injects an instance of the `SampleService` class.

- `SampleService`: This service class provides two sample methods that return strings.

- `sampleInterceptor`: This aspect class defines several pointcut expressions to intercept specific methods in the application.

- `AppConfig`: This configuration class enables component scanning and configures the Spring AOP aspect.

## Interceptor Configuration

The `sampleInterceptor` aspect intercepts specific methods in the `SampleController` class based on the defined pointcut expressions. When a method matching the pointcut is invoked, the aspect prints a message to the console indicating the intercepted method and the corresponding policy.

## Usage

The application exposes the following RESTful API endpoints:

1. `GET /api/controller-method1`: Returns a "Hello World!" message from the `firstMethod` in the `SampleController` class. The method is intercepted by the `sampleInterceptor` aspect with policy 1.

2. `GET /api/controller-method2`: Returns a "Hello World!" message from the `secondMethod` in the `SampleController` class. The method is intercepted by the `sampleInterceptor` aspect with policy 2.

When you access these endpoints, the intercepted methods will print messages to the console, indicating the interception by the corresponding policies.

## Configuration

The application uses Spring's component scanning to automatically detect and configure the components, including the controller, service, and aspect. The configuration is defined in the `AppConfig` class.

The project uses Maven as the build tool, and the dependencies are listed in the `pom.xml` file.

## License

