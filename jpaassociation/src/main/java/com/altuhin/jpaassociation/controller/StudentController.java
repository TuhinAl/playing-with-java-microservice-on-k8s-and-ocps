package com.altuhin.jpaassociation.controller;

import com.altuhin.jpaassociation.dto.StudentDto;
import com.altuhin.jpaassociation.entiry.Student;
import com.altuhin.jpaassociation.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentDto studentDto) {

        return studentService.saveStudent(studentDto);
    }

//    @DeleteMapping("/{id}")
//    public String getStudentWithAddressById(@PathVariable Long id) {
//
//        return studentService.getStudentWithAddressById(id);
//    }


    @PostMapping("/save/course")
    public StudentDto saveStudentAndCourse(@RequestBody StudentDto studentDto) {
        return studentService.saveStudentAndCourse(studentDto);
    }

    @GetMapping("/course/{id}")
    public StudentDto getStudentAndCourse(@PathVariable Long id) {
        return studentService.getStudentAndCourse(id);
    }
}
