package com.example.demo;

import com.example.demo.course.Course;
import com.example.demo.course.CourseRepository;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository, CourseRepository courseRepository){
//        return args -> {
//            Student maria = new Student(
//                    "Maria",
//                    "Jones",
//                    "maria@gmail.com",
//                    12L
//            );
//            maria = studentRepository.save(maria);
//
//            Course course = new Course(
//                "JavaScript",
//                    "FULLSTACK JS COURSE",
//                    maria
//            );
//            courseRepository.save(course);
//        };
//    }
}