# Banking Microservices with Eureka Discovery Server

## 📌 Project Overview

This project demonstrates a simple Microservices Architecture using Spring Boot and Netflix Eureka.

The application consists of three independent Spring Boot projects:

- Account Microservice
- Loan Microservice
- Eureka Discovery Server

Both microservices register themselves with the Eureka Server and can be discovered by other services.

This project was developed as part of the **Cognizant Java Full Stack Engineer Deep Skilling Program**.

---

# Project Structure

```
microservices/
│
├── account/
│
├── loan/
│
└── eurekaserver/
```

---

# Technologies Used

- Java 21
- Spring Boot 3.5.x
- Spring Web
- Spring Boot DevTools
- Spring Cloud Netflix Eureka
- Maven
- Eclipse IDE
- Git
- GitHub

---

# Account Microservice

### Port

```
8080
```

### Endpoint

```
GET /accounts/{number}
```

### Example

```
http://localhost:8080/accounts/00987987973432
```

### Sample Response

```json
{
  "number": "00987987973432",
  "type": "Savings",
  "balance": 234343
}
```

---

# Loan Microservice

### Port

```
8081
```

### Endpoint

```
GET /loans/{number}
```

### Example

```
http://localhost:8081/loans/H00987987972342
```

### Sample Response

```json
{
  "number": "H00987987972342",
  "type": "Car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

# Eureka Discovery Server

### Port

```
8761
```

### Dashboard

```
http://localhost:8761
```

After running all applications, Eureka displays the registered services.

Example:

```
Instances currently registered with Eureka

ACCOUNT
Status : UP

LOAN
Status : UP
```

---

# How to Run

## Step 1

Start the Eureka Server.

```
Run As → Spring Boot App
```

Wait until it starts on

```
http://localhost:8761
```

---

## Step 2

Run the Account Microservice.

```
Port : 8080
```

Verify

```
http://localhost:8080/accounts/00987987973432
```

---

## Step 3

Run the Loan Microservice.

```
Port : 8081
```

Verify

```
http://localhost:8081/loans/H00987987972342
```

---

## Step 4

Open Eureka Dashboard

```
http://localhost:8761
```

Both services should appear with status **UP**.

---

# Maven Dependencies

## Account

- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Spring Cloud Netflix Eureka Client

## Loan

- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Spring Cloud Netflix Eureka Client

## Eureka Server

- Spring Boot Starter Web
- Spring Cloud Netflix Eureka Server

---

# Configuration

## Account

```properties
spring.application.name=account

server.port=8080

eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
```

---

## Loan

```properties
spring.application.name=loan

server.port=8081

eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
```

---

## Eureka Server

```properties
spring.application.name=eureka-server

server.port=8761

eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
```

---

# Features

- Spring Boot REST APIs
- Independent Microservices
- Service Discovery using Eureka
- JSON Responses
- Maven Build
- Spring Cloud Netflix Eureka
- Easy Service Registration

---

# Learning Outcomes

After completing this project, I learned:

- What Microservices are
- Difference between Monolithic and Microservices Architecture
- Creating independent Spring Boot Microservices
- REST API Development
- Registering services with Eureka Discovery Server
- Service Discovery
- Running multiple Spring Boot applications on different ports
- Maven dependency management
- Git and GitHub project management

---

# Future Enhancements

- API Gateway
- OpenFeign Client
- Config Server
- Resilience4j Circuit Breaker
- Centralized Logging
- Database Integration

---

# Author

**Anusha Yeligar**

Information Science & Engineering

Java Full Stack Developer

GitHub: https://github.com/anusha-14331

---

# Acknowledgement

This project was completed as part of the **Cognizant Java Full Stack Engineer Deep Skilling Program** to understand Spring Boot Microservices and Service Discovery using Netflix Eureka.