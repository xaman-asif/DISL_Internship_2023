package com.example.demo.course;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentRepository studentRepository;

    public List<Course> getAllCoursesByStudentId(Long studentId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByStudentId(studentId).forEach(
                courses::add
        );
        return courses;
    }

    public Course getCourse(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    public Course addCourse(Course course) {

        return courseRepository.save(course);
    }

    public Course updateCourse(Course course) {
        Course courseFromDB = courseRepository.findById(course.getId()).orElse(null);
        if (courseFromDB != null) {
            return courseRepository.save(course);
        }
        return null;
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }
}
