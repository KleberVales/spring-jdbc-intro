# 🌱 Spring JDBC Intro

A simple Spring Boot application demonstrating how to use **Spring JDBC** with an **H2 in-memory database**. This project is ideal for learning the basics of JDBC integration in a Spring context without the complexity of JPA or ORM frameworks.

---

## 🚀 Features

- ✅ Spring Boot setup with Kotlin DSL (Gradle)
- ✅ H2 in-memory database for quick prototyping
- ✅ Basic `Product` entity with insert and fetch operations
- ✅ Clean separation of service and repository layers
- ✅ Console-based interaction and logging

---

## 🛠️ Technologies Used

| Tool / Framework     | Version / Notes         |
|----------------------|-------------------------|
| Java                 | 21                     |
| Spring Boot          | 3.x                     |
| Spring JDBC          | Native JDBC support     |
| H2 Database          | In-memory configuration |
| Gradle (Kotlin DSL)  | Build automation        |

---

## 📦 Project Structure

```
spring-jdbc-intro/
├── build.gradle.kts              # Configuração Gradle (Kotlin DSL)
├── settings.gradle.kts           # Nome do projeto
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/springjdbcintro/
│   │   │       ├── SpringJdbcIntroApplication.java
│   │   │       ├── model/
│   │   │       │   └── Product.java
│   │   │       ├── repository/
│   │   │       │   └── ProductRepository.java
│   │   │       ├── service/
│   │   │       │   └── ProductService.java
│   │   │       └── config/
│   │   │           └── DataSourceConfig.java  # Opcional (Spring Boot já configura automaticamente)
│   │   ├── resources/
│   │   │   ├── application.yml
│   │   │   ├── schema.sql
│   │   │   └── data.sql
│   └── test/
│       └── java/
│           └── com/example/springjdbcintro/
│               └── SpringJdbcIntroApplicationTests.java
└── README.md

```
