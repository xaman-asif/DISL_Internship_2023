package com.example.demo.student;

import com.example.demo.requests.CreateStudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(CreateStudentRequest request) {
        Student student = new Student();
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        return studentRepository.save(student);
    }

    public Student updateStudent(CreateStudentRequest request, Long id) {
        Student student = new Student();
        student.setId(id);
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        return studentRepository.save(student);
//            Student userFromDB = studentRepository.findById(id);
//            userFromDB
    }

    public void deleteStudent(Long id) {
        //

        studentRepository.deleteById(id);
    }
}
