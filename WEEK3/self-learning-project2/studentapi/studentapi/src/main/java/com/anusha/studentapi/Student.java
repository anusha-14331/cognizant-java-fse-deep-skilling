package com.anusha.studentapi;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Student {

    @Min(value = 1, message = "Id must be greater than 0")
    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Department cannot be empty")
    private String department;

    // Empty Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}