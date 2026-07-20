# Hands-On 9: State Management with NgRx

## Objective

Learn state management in Angular using NgRx Store, Actions, Reducers, Selectors, Effects, and Redux DevTools.

---

## Technologies Used

- Angular 21
- NgRx Store
- NgRx Effects
- NgRx Store DevTools
- RxJS
- TypeScript

---

## Features Implemented

### ✅ Store Configuration

- Installed:
  - @ngrx/store
  - @ngrx/effects
  - @ngrx/entity
  - @ngrx/store-devtools
- Configured NgRx Store using `provideStore()`
- Registered feature states using `provideState()`
- Configured Redux DevTools

---

### ✅ Course State

Created:

- course.actions.ts
- course.reducer.ts
- course.selectors.ts
- course.state.ts
- course.effects.ts

Implemented:

- Load Courses Action
- Load Courses Success Action
- Load Courses Failure Action
- Reducer with immutable state updates
- Memoized selectors
- Effect for loading courses using HttpClient

---

### ✅ Enrollment State

Created:

- enrollment.actions.ts
- enrollment.reducer.ts
- enrollment.selectors.ts
- enrollment.state.ts

Implemented:

- Enroll
- Unenroll
- Set Enrolled Courses
- Enrollment selectors

---

## Learning Outcomes

- NgRx Store
- Actions
- Reducers
- Effects
- Selectors
- Immutable State
- Redux Pattern
- State Management
- Redux DevTools

---

## Note

This project was developed using **Angular 21**. The Digital Nurture 5.0 Hands-On guide targets **Angular 20**, so while the NgRx store structure, actions, reducers, selectors, and effects were implemented successfully, the Effect registration required additional version-specific configuration in Angular 21. The core NgRx concepts and project structure were completed successfully.

---

## Status

✅ Hands-On 9 Completed (NgRx Store Setup and State Management)