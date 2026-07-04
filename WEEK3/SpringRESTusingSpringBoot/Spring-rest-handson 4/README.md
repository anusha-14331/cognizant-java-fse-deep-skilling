# 🌍 REST - Country Web Service

## 📖 Overview

This project demonstrates how to build a **RESTful Web Service** using **Spring Boot** and **Spring Core XML Configuration**.

The application loads a `Country` bean from the Spring XML configuration file (`country.xml`) and exposes it through a REST API. When a client sends a request to the `/country` endpoint, the application returns the details of India in **JSON** format.

This hands-on also demonstrates how Spring Boot automatically converts Java objects into JSON responses using **Jackson**.

---

## 🎯 Objective

- Build a REST API using Spring Boot.
- Load a Spring Bean from an XML configuration file.
- Return the bean as a JSON response.
- Understand the role of `ApplicationContext`.
- Learn how Spring Boot converts Java objects into JSON automatically.

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Context
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
│   │   │       ├── Country.java
│   │   │       ├── SpringLearnApplication.java
│   │   │       └── controller
│   │   │           └── CountryController.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── country.xml
│
└── pom.xml
```

---

## 🌐 REST Endpoint

| Method | URL | Description |
|---------|-----|-------------|
| GET | `/country` | Returns the details of India |

### Request

```
GET http://localhost:8083/country
```

### Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---

## ⚙️ Spring XML Configuration

```xml
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN"/>
    <property name="name" value="India"/>
</bean>
```

---

## 💻 Controller Implementation

```java
@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country =
                context.getBean("country", Country.class);

        return country;
    }
}
```

---

## 🔄 Application Flow

```
Client (Browser/Postman)
            │
            ▼
GET /country
            │
            ▼
CountryController
            │
            ▼
Load country.xml
            │
            ▼
Spring IoC Container
            │
            ▼
Create Country Bean
            │
            ▼
Return Country Object
            │
            ▼
Jackson converts Object → JSON
            │
            ▼
JSON Response sent to Client
```

---

## 🚀 How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Reload Maven dependencies.
4. Ensure the server port is set to **8083**.
5. Run `SpringLearnApplication.java`.
6. Open the browser or Postman.
7. Send a GET request to:

```
http://localhost:8083/country
```

---

## 📌 Expected Output

```json
{
  "code": "IN",
  "name": "India"
}
```

---

## 📚 Key Concepts Covered

- Spring Boot
- Spring Core
- Spring Bean
- XML Bean Configuration
- IoC Container
- ApplicationContext
- ClassPathXmlApplicationContext
- REST API
- @RestController
- @RequestMapping
- JSON Response
- Jackson Library
- HTTP GET Request
- Browser Testing
- Postman Testing

---

## 🌐 HTTP Information

### Request

```
GET /country
```

### Response

```
Status : 200 OK
Content-Type : application/json
```

---

## 🧠 Interview Questions

### What is `@RestController`?

`@RestController` is used to create REST APIs. It combines `@Controller` and `@ResponseBody`.

---

### What is `@RequestMapping`?

It maps an HTTP request URL to a controller method.

---

### What is `ApplicationContext`?

It is the Spring IoC Container responsible for creating and managing Spring beans.

---

### What is `ClassPathXmlApplicationContext`?

It loads Spring bean definitions from an XML configuration file located in the classpath.

---

### What happens inside the controller?

1. Loads `country.xml`.
2. Creates the Spring Bean.
3. Retrieves the `Country` object.
4. Returns the object.
5. Spring Boot automatically converts it into JSON.

---

### How is Java Object converted into JSON?

Spring Boot uses the **Jackson** library to automatically serialize Java objects into JSON before sending the response to the client.

---

## 📷 Screenshots

Add screenshots of:

- 📁 Project Structure
- 📄 country.xml
- 💻 Country.java
- 💻 CountryController.java
- 🌐 Browser Output
- 📮 Postman Output
- 🌍 Browser Network → Headers
- 📋 Postman Headers

---

## 🎓 Learning Outcomes

- Learned how to expose Spring Beans as REST APIs.
- Understood XML-based bean configuration.
- Learned the role of the Spring IoC Container.
- Understood automatic JSON conversion using Jackson.
- Gained experience testing REST APIs using Browser and Postman.

---

## ✅ Result

Successfully developed a RESTful Web Service that loads a `Country` bean from the Spring XML configuration and returns the country details as a JSON response. The API was successfully tested using both Browser and Postman.

---

## 👩‍💻 Developed By

**Anusha Yeligar**

**Cognizant Java FSE Deep Skilling Program**