# Hands-On 8: HTTP Client – API Integration, Observables & Interceptors

## Objective

This hands-on demonstrates how to integrate Angular applications with a REST API using HttpClient, work with Observables and RxJS operators, and implement HTTP Interceptors for authentication, error handling, and loading indicators.

---

## Technologies Used

- Angular 20
- TypeScript
- HttpClient
- RxJS
- JSON Server
- Angular Routing

---

## Features Implemented

### Task 1 – HTTP Client Integration

- Configured HttpClient using `provideHttpClient()`
- Connected Angular application with JSON Server
- Implemented:
  - GET
  - POST
  - PUT
  - DELETE
- Displayed live course data from API

---

### Task 2 – RxJS Operators

Implemented the following operators:

- `map()`
- `tap()`
- `catchError()`
- `retry(2)`
- `switchMap()`

Features:

- Filters courses using `map()`
- Logs API responses using `tap()`
- Handles HTTP errors using `catchError()`
- Retries failed requests using `retry()`
- Loads enrolled students for a selected course using `switchMap()`

---

### Task 3 – HTTP Interceptors

Implemented three interceptors:

#### Authentication Interceptor

- Adds Authorization header to every request.

```
Authorization: Bearer mock-token-12345
```

#### Error Interceptor

- Handles global HTTP errors.
- Displays appropriate messages for:
  - 401 Unauthorized
  - 500 Internal Server Error

#### Loading Interceptor

- Displays loading state during API requests.
- Uses `BehaviorSubject` with `LoadingService`.

---

## API Endpoints

JSON Server

```
http://localhost:3000/courses
```

```
GET    /courses
GET    /courses/:id
POST   /courses
PUT    /courses/:id
DELETE /courses/:id
```

---

## Project Structure

```
src/
 ├── components/
 ├── pages/
 ├── services/
 │     ├── course.service.ts
 │     ├── enrollment.service.ts
 │     └── loading.service.ts
 ├── interceptors/
 │     ├── auth.interceptor.ts
 │     ├── error-handler.interceptor.ts
 │     └── loading.interceptor.ts
 ├── models/
 ├── app.config.ts
```

---

## How to Run

### Install dependencies

```bash
npm install
```

### Install JSON Server

```bash
npm install -g json-server
```

### Start JSON Server

```bash
json-server --watch db.json --port 3000
```

### Run Angular Application

```bash
ng serve
```

Open

```
http://localhost:4200
```

---

## Output

- Course list loads from REST API.
- Course details are fetched using route parameters.
- CRUD operations work successfully.
- Authorization header is added to every request.
- Errors are handled globally.
- Loading state is managed through an interceptor.

---

## Learning Outcomes

- Angular HttpClient
- REST API Integration
- CRUD Operations
- Observables
- RxJS Operators
- HTTP Interceptors
- Error Handling
- Loading Indicators
- JSON Server Integration

---

## Status

**Hands-On 8 Completed Successfully**