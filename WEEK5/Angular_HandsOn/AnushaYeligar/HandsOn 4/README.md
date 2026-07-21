# 📘 Angular Hands-on 4 – Template-Driven Forms & Validation

## 📌 Objective

Build a Student Enrollment Request Form using Angular Template-Driven Forms with built-in validation, error handling, and form submission.

---

## Topics Covered

- Template-Driven Forms
- FormsModule
- ngForm
- ngModel
- Two-Way Data Binding
- Built-in Validators
- Validation Error Messages
- Form Submission
- Form Reset

---

## Features Implemented

### Task 1 – Enrollment Form

- Created Enrollment Form Component
- Added `/enroll` route
- Built a template-driven form using `ngForm`
- Added the following fields:
  - Student Name
  - Student Email
  - Course ID
  - Preferred Semester
  - Agree to Terms
- Used `[(ngModel)]` for two-way binding
- Logged `form.value` and `form.valid` on submission
- Disabled Submit button when the form is invalid

### Task 2 – Validation

- Added `required` validation
- Added `minlength` validation for Student Name
- Added `email` validation for Student Email
- Displayed contextual validation error messages
- Applied Angular form state CSS classes:
  - `.ng-invalid.ng-touched`
  - `.ng-valid.ng-touched`
- Displayed a success message after successful submission
- Added a Reset button using `resetForm()`

---

## Technologies Used

- Angular 20
- TypeScript
- HTML
- CSS
- FormsModule

---

## Learning Outcomes

- Built Template-Driven Forms
- Implemented two-way data binding with `ngModel`
- Used `NgForm` for form handling
- Applied Angular built-in validators
- Displayed dynamic validation messages
- Styled form controls based on validation state
- Reset forms programmatically

---

## Outcome

Successfully created a fully functional Student Enrollment Form with validation, submission handling, success message, and reset functionality using Angular Template-Driven Forms.

---

**Author:** Anusha Yeligar