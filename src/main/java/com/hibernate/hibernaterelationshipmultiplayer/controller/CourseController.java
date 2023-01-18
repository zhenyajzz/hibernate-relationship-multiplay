package com.hibernate.hibernaterelationshipmultiplayer.controller;

import com.hibernate.hibernaterelationshipmultiplayer.entity.Course;
import com.hibernate.hibernaterelationshipmultiplayer.repo.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    final
    CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping("/courses")
    private List<Course> findAllCourses(){

        return courseRepository.findAll();
    }

    @PostMapping("/create/course")
    private Course createCourse(@RequestBody Course course){

        return courseRepository.save(course);
    }
}
