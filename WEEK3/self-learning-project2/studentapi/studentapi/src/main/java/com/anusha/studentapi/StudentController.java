package com.anusha.studentapi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import jakarta.validation.Valid;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>();
    @PostMapping("/students")
    public Student addStudent(@Valid @RequestBody Student student) {

        students.add(student);

        return student;
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return students;
    }
    @GetMapping("/students/{id}")
    public StudentDTO getStudentById(@PathVariable int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                StudentDTO dto = new StudentDTO();

                dto.setId(student.getId());
                dto.setName(student.getName());

                // Add HATEOAS links
                dto.add(linkTo(methodOn(StudentController.class)
                        .getStudentById(id))
                        .withSelfRel());

                dto.add(linkTo(methodOn(StudentController.class)
                        .getAllStudents())
                        .withRel("allStudents"));

                return dto;
            }
        }

        throw new StudentNotFoundException(
                "Student with ID " + id + " not found"
        );
    }
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestBody Student updatedStudent) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(updatedStudent.getName());
                student.setDepartment(updatedStudent.getDepartment());

                return student;
            }
        }

        return null;
    }
    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                return "Student deleted successfully";
            }
        }

        return "Student not found";
    }
}
