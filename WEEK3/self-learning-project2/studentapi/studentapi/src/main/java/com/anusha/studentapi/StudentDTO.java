package com.anusha.studentapi;
import org.springframework.hateoas.RepresentationModel;

public class StudentDTO extends RepresentationModel<StudentDTO> {
    private int id;
    private String name;

    public StudentDTO() {
    }

    public StudentDTO(int id, String name) {
        this.id = id;
        this.name = name;
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
}
