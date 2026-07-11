# 🌍 REST - Get Country Based on Country Code

## 📖 Overview

This project demonstrates a RESTful Web Service using Spring Boot that returns country details based on the country code provided in the URL. The country data is loaded from `country.xml`, and the search is performed in a case-insensitive manner.

---

## 🎯 Objective

- Create a REST API using `@GetMapping`.
- Retrieve country details using `@PathVariable`.
- Implement a Service layer.
- Load country data from Spring XML configuration.
- Return the response in JSON format.

---

## 🛠️ Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Context
- Maven
- IntelliJ IDEA

---

## 🌐 REST Endpoint

**Method:** GET

```
http://localhost:8083/countries/{code}
```

### Example Request

```
http://localhost:8083/countries/in
```

### Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---

## 📚 Concepts Covered

- REST API
- `@GetMapping`
- `@PathVariable`
- `@Service`
- `@Autowired`
- Spring XML Configuration
- ApplicationContext
- JSON Response
- Case-Insensitive Search

---

## ✅ Result

Successfully implemented a REST API that retrieves country details based on the country code from Spring XML configuration and returns the data as a JSON response.

---

## 👩‍💻 Developed By

**Anusha Yeligar**