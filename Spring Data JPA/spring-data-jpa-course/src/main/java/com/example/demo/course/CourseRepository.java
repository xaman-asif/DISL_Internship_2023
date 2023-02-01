package com.example.demo.course;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    public List<Course> findByStudentId(Long studentId);
}
