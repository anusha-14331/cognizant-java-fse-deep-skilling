# Hands-On 7 – Angular Routing, Guards & Lazy Loading

## Objective

Implement Angular Routing features including dynamic routes, nested routes, query parameters, lazy loading, route guards, and route protection in the Student Course Portal application.

---

## Features Implemented

### 1. Route Configuration
- Home Route (`/`)
- Courses Route (`/courses`)
- Course Detail Route (`/courses/:id`)
- Student Profile Route (`/profile`)
- Not Found Route (`**`)

---

### 2. Route Parameters

Implemented dynamic route parameters.

Example:

```
/courses/1
/courses/2
```

Used `ActivatedRoute` to read the course ID.

---

### 3. Query Parameters

Implemented search functionality using query parameters.

Example:

```
/courses?search=angular
```

The search term is stored in the URL and retrieved using `ActivatedRoute`.

---

### 4. Nested Routing

Created a `CoursesLayoutComponent` with a child router outlet.

Routes:

```
courses
│
├── Course List
└── Course Detail
```

---

### 5. Lazy Loading

Created a separate Enrollment Feature Module.

```
/enroll
```

The module loads only when the route is visited, improving application performance.

---

### 6. CanActivate Guard

Implemented an Authentication Guard.

Protected Routes:

- Profile
- Enrollment

Behavior:

- If `isLoggedIn = true`
  - Navigation is allowed.

- If `isLoggedIn = false`
  - User is redirected to the Home page.

---

### 7. CanDeactivate Guard

Implemented an Unsaved Changes Guard.

Behavior:

- Detects unsaved form changes.
- Displays a confirmation dialog before leaving the page.

Message:

```
You have unsaved changes. Leave this page?
```

---

## Project Structure

```
src/
│
├── app/
│   ├── guards/
│   │     ├── auth-guard.ts
│   │     └── unsaved-changes-guard.ts
│   │
│   ├── services/
│   │     └── auth.ts
│   │
│   ├── pages/
│   │     ├── home/
│   │     ├── course-list/
│   │     ├── course-detail/
│   │     ├── courses-layout/
│   │     ├── enrollment-form/
│   │     ├── reactive-enrollment-form/
│   │     ├── student-profile/
│   │     └── not-found/
│   │
│   ├── features/
│   │     └── enrollment/
│   │           ├── enrollment.module.ts
│   │           └── enrollment-routing-module.ts
│   │
│   ├── app.routes.ts
│   └── app.config.ts
```

---

## Technologies Used

- Angular 20
- TypeScript
- Angular Router
- Route Guards
- Lazy Loading
- Reactive Forms
- Template Driven Forms

---

## Learning Outcomes

- Configured Angular Routes
- Used Route Parameters
- Implemented Query Parameters
- Created Nested Routes
- Implemented Lazy Loading
- Protected Routes using CanActivate Guard
- Prevented Data Loss using CanDeactivate Guard

---

## Status

✅ Hands-On 7 Completed Successfully