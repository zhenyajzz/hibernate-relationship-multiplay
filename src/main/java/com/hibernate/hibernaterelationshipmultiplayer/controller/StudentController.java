package com.hibernate.hibernaterelationshipmultiplayer.controller;

import com.hibernate.hibernaterelationshipmultiplayer.entity.Course;
import com.hibernate.hibernaterelationshipmultiplayer.entity.Student;
import com.hibernate.hibernaterelationshipmultiplayer.repo.CourseRepository;
import com.hibernate.hibernaterelationshipmultiplayer.repo.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    final
    StudentRepository studentRepository;
    CourseRepository courseRepository;

    public StudentController(StudentRepository studentRepository,CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @GetMapping("/students")
    private List<Student> findAllStudents(){

        return studentRepository.findAll();
    }

//    @GetMapping("/findStudentByName/{name}")
//    private Student findStudentByName(@PathVariable String name){
//
//        return studentRepository.findByName(name);
//    }
//
//    @GetMapping("/findStudentsWhereAgesLessThen/{number}")
//    private List<Student> findStudentsWhereAgesLessThen(@PathVariable Integer number){
//
//        return studentRepository.findByAgeLessThan(number);
//    }
//
//    @GetMapping("/findStudentsWhereAgesGraterThen/{number}")
//    private List<Student> findStudentsWhereAgesGraterThen(@PathVariable Integer number){
//
//        return studentRepository.findByAgeGreaterThan(number);
//    }
//
//    @GetMapping("/findStudentsByLetter/{letter}")
//    private List<Student> findStudentsByLetter(@PathVariable String letter){
//
//        return studentRepository.findByNameContaining(letter);
//    }
//
//    @GetMapping("/findByNameNot/{name}")
//    private List<Student> findByNameNot(@PathVariable String name){
//
//        return studentRepository.findByNameNot(name);
//    }

    @PostMapping("/create/student")
    private Student createStudent(@RequestBody Student student){

        return studentRepository.save(student);
    }

    @GetMapping("/student/course/{studentId}/{courseId}")
    private Student findStudentWithCourse(@PathVariable Long studentId,@PathVariable Long courseId){

        Student student = studentRepository.findById(studentId).get();
        Course course = courseRepository.findById(courseId).get();

        student.getCourses().add(course);

        return studentRepository.save(student);

    }


}
