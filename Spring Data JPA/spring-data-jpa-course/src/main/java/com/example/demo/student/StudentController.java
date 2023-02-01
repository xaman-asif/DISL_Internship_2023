package com.example.demo.student;

import com.example.demo.requests.CreateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students/all")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping("/students/{studentId}")
    public Student getStudent(@PathVariable Long studentId) {
        return studentService.getStudent(studentId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students/add")
    public Student addStudent(@RequestBody @Valid CreateStudentRequest student) {
        return studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}/update")
    public Student updateStudent(@RequestBody @Valid CreateStudentRequest student, @PathVariable Long id) {
        return studentService.updateStudent(student, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}/delete")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
