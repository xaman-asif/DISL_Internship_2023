package com.example.demo.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/students/{studentId}/courses")
    public List<Course> getAllCoursesByStudentId(@PathVariable Long studentId) {
        return courseService.getAllCoursesByStudentId(studentId);
    }

    @RequestMapping("/students/{studentId}/courses/{id}")
    public Course getCourse(@PathVariable Long id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students/{studentId}/courses/add")
    public Course addCourse(@RequestBody Course course, @PathVariable Long studentId) {
        return courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{studentId}/courses/{id}/update")
    public Course updateCourse(@RequestBody Course course, @PathVariable Long studentId, @PathVariable Long id) {
        if (course.getId() == id)
            return courseService.updateCourse(course);
        else
            return null;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{studentId}/courses/{id}/delete")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }

    @RequestMapping("/courses/all")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}