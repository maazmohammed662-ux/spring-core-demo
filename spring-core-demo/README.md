# Spring Core Demo

A small Java project that shows how the **Spring Framework container** creates and manages objects (beans) for you, using **XML configuration**.

## What it demonstrates

- **Inversion of Control (IoC):** the Spring container creates the `Car` object, not `new Car()` in my code.
- **Loose coupling:** `App` works with the `Vehicle` interface only. Swapping the implementation means changing one line in `spring.xml`.
- **Bean configuration in XML:** the `vehicle` bean is declared in `spring.xml`.
- **`ApplicationContext` and `getBean()`:** the app loads the container and retrieves the bean by its id.
- **A basic JUnit 5 test** that checks the bean is loaded from the container.

## Project structure

```
spring-core-demo
├── pom.xml
└── src
    ├── main
    │   ├── java/com/maaz/springdemo
    │   │   ├── App.java        # loads the container, gets the bean, calls drive()
    │   │   ├── Vehicle.java    # interface
    │   │   └── Car.java        # implementation
    │   └── resources
    │       └── spring.xml      # bean configuration
    └── test/java/com/maaz/springdemo
        └── AppTest.java        # JUnit 5 test
```

## How it works

1. `App` creates a `ClassPathXmlApplicationContext("spring.xml")`, which starts the Spring container.
2. The container reads `spring.xml` and creates the bean with id `vehicle` from the class `Car`.
3. `App` calls `context.getBean("vehicle")` and receives the `Car` object as a `Vehicle`.
4. Calling `drive()` prints `Driving...`.

## Tech stack

Java 8+, Spring Framework 5.3 (`spring-context`), Maven, JUnit 5

## Prerequisites

- JDK 8 or higher
- Maven 3.6+ (or run it from Eclipse / Spring Tools using Maven import)

## Run it

```bash
git clone https://github.com/maazmohammed662-ux/spring-core-demo.git
cd spring-core-demo
mvn compile exec:java
```

Expected output:

```
Driving...
```

(Spring may also print a few log lines before it.)

## Run the tests

```bash
mvn test
```

## Learning source

Built while following the beginner Spring Framework tutorial by Telusko (Navin Reddy) on YouTube, to learn IoC, beans and the ApplicationContext.

## Ideas for next steps

- Add a second implementation (for example `Bike`) and switch between them in `spring.xml`
- Inject a dependency into `Car` (for example a `Tyre` class) using setter or constructor injection
- Replace the XML configuration with annotations (`@Component`, `@Autowired`)
- Move the same idea into a Spring Boot application
