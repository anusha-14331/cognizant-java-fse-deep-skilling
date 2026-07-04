# 🌍 Spring Core – Load Country from Spring Configuration XML

## 📖 Overview

This project demonstrates the fundamentals of **Spring Core** using **XML-based Bean Configuration**.

A `Country` object is configured in the `country.xml` file, and the Spring IoC Container creates and manages the object. The application retrieves the bean using `ApplicationContext` and displays the country details.

This hands-on focuses on understanding **Spring Beans**, **Dependency Injection (DI)**, and the **IoC Container**.

---

## 🎯 Objective

- Learn XML-based Spring Bean Configuration.
- Understand how the Spring IoC Container creates and manages objects.
- Configure a bean using `country.xml`.
- Retrieve the bean using `ApplicationContext`.
- Observe constructor and setter invocation during bean creation.

---

## 🛠️ Technologies Used

- Java 21
- Spring Framework (Spring Core)
- Maven
- IntelliJ IDEA Community Edition

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
│   │   │       └── SpringLearnApplication.java
│   │   │
│   │   └── resources
│   │       └── country.xml
│
└── pom.xml
```

---

## ⚙️ Spring Bean Configuration

```xml
<bean id="country" class="com.cognizant.springlearn.Country">
    <property name="code" value="IN"/>
    <property name="name" value="India"/>
</bean>
```

---

## 🚀 How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Reload Maven dependencies.
4. Run `SpringLearnApplication.java`.
5. Observe the console output.

---

## 📌 Expected Output

```
Inside Country Constructor.
Inside setCode()
Inside setName()

Country : Country{code='IN', name='India'}
```

---

## 🔄 Spring Bean Creation Flow

```
Application Starts
        │
        ▼
Reads country.xml
        │
        ▼
Creates Country Bean
        │
        ▼
Calls Constructor
        │
        ▼
Calls setCode()
        │
        ▼
Calls setName()
        │
        ▼
Stores Bean in IoC Container
        │
        ▼
context.getBean("country")
        │
        ▼
Returns Country Object
```

---

## 📚 Key Concepts Learned

- Spring Core
- Inversion of Control (IoC)
- Dependency Injection (Setter Injection)
- Spring Beans
- XML Bean Configuration
- ApplicationContext
- ClassPathXmlApplicationContext
- Bean Lifecycle
- Spring IoC Container

---

## 🧠 Interview Questions Covered

- What is a Spring Bean?
- What is IoC (Inversion of Control)?
- What is Dependency Injection?
- What is ApplicationContext?
- What is ClassPathXmlApplicationContext?
- What happens when `context.getBean()` is invoked?
- Difference between creating an object manually and using Spring.

---

## 📷 Output

> Add the following screenshots here:
>
> - Project Structure
> - country.xml
> - Country.java
> - SpringLearnApplication.java
> - Console Output

---

## ✅ Result

Successfully configured and loaded a Spring Bean using XML configuration. The Spring IoC Container created, initialized, and managed the `Country` object, demonstrating the core concepts of Spring Framework.

---

### 👩‍💻 Developed by

**Anusha Yeligar**