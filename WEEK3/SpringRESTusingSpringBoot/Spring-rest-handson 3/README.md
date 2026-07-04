# 🌐 Hello World RESTful Web Service

## 📖 Overview

This project demonstrates the creation of a simple **RESTful Web Service** using **Spring Boot** and **Spring Web**.

A REST endpoint `/hello` is created using `@RestController` and `@GetMapping`. When accessed through a web browser or Postman, the API returns the response:

```
Hello World!!
```

The project also demonstrates the use of **SLF4J Logging** to log the start and end of the request execution.

---

## 🎯 Objective

- Build a simple REST API using Spring Boot.
- Understand the use of `@RestController`.
- Learn request mapping using `@GetMapping`.
- Test REST APIs using Browser and Postman.
- Observe HTTP Request and Response Headers.

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Maven
- IntelliJ IDEA
- Postman

---

## 📂 Project Structure

```
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.springlearn
│   │   │       ├── SpringLearnApplication.java
│   │   │       └── controller
│   │   │           └── HelloController.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│
└── pom.xml
```

---

## 🚀 REST Endpoint

| Method | URL | Description |
|---------|-----|-------------|
| GET | `/hello` | Returns "Hello World!!" |

Example URL:

```
http://localhost:8083/hello
```

---

## 💻 Controller Code

```java
@RestController
public class HelloController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {

        LOGGER.info("START");

        LOGGER.info("END");

        return "Hello World!!";
    }
}
```

---

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Reload Maven dependencies.
4. Set the server port to **8083** in `application.properties`.
5. Run `SpringLearnApplication.java`.
6. Open:

```
http://localhost:8083/hello
```

or test using Postman.

---

## ⚙️ application.properties

```properties
server.port=8083
```

---

## 📌 Expected Output

### Browser

```
Hello World!!
```

### Postman

```
Hello World!!
```

---

## 📊 Execution Flow

```
Application Starts
        │
        ▼
Spring Boot Starts
        │
        ▼
Scans @RestController
        │
        ▼
Registers /hello endpoint
        │
        ▼
Client sends GET request
        │
        ▼
sayHello() method executes
        │
        ▼
Returns "Hello World!!"
```

---

## 📚 Concepts Covered

- Spring Boot
- REST Architecture
- REST Controller
- HTTP GET Method
- @GetMapping
- Logging using SLF4J
- HTTP Request
- HTTP Response
- Browser Testing
- Postman Testing

---

## 🌐 HTTP Details

### Request

```
GET /hello
```

### Response

```
Status : 200 OK
Content-Type : text/plain;charset=UTF-8
```

---

## 🧠 Interview Questions

### What is REST?

REST (Representational State Transfer) is an architectural style used to build web services using HTTP methods.

---

### What is `@RestController`?

`@RestController` is a Spring annotation used to create RESTful web services. It combines `@Controller` and `@ResponseBody`.

---

### What is `@GetMapping`?

It maps HTTP GET requests to a controller method.

---

### Why do we use Logger?

Logging helps monitor application execution, debug issues, and record important events in a structured way.

---

### What is HTTP Status Code 200?

It indicates that the request was successfully processed.

---

## 📷 Screenshots

Include screenshots of:

- Project Structure
- HelloController.java
- application.properties
- Browser Output
- Postman Output
- Browser Network → Headers
- Postman Headers

---

## ✅ Result

Successfully developed a RESTful Web Service using Spring Boot that returns **"Hello World!!"**. The API was tested successfully using both **Browser** and **Postman**, and HTTP request/response details were verified.

---

### 👩‍💻 Developed by

**Anusha Yeligar**