package com.altuhin.jpaassociation.service;

import com.altuhin.jpaassociation.dto.StudentDto;
import com.altuhin.jpaassociation.entiry.Course;
import com.altuhin.jpaassociation.entiry.Student;
import com.altuhin.jpaassociation.repository.CourseRepository;
import com.altuhin.jpaassociation.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

//    private final AddressRepository addressRepository;

    public Student saveStudent(StudentDto studentDto) {
//        Address address = new Address(studentDto.getAddressCity(), studentDto.getAddressDivision(),studentDto.getAddressPostalCode());

//        Address save = addressRepository.save(address);
        Student student = new Student(studentDto.getName(), studentDto.getEmail());
        studentRepository.save(student);
        return student;
    }

    public StudentDto saveStudentAndCourse(StudentDto studentDto) {

        List<Course> courseList = new ArrayList<>();

        for (Course course : studentDto.getCourseList()) {
            Course newCourse = new Course(course.getCourseName(), course.getCourseCode());
            courseList.add(newCourse);
        }

        Student student = new Student(studentDto.getName(), studentDto.getEmail(), courseList);
        studentRepository.save(student);
        return studentDto;
    }

    public StudentDto getStudentAndCourse(Long id) {

        StudentDto studentDto = new StudentDto();
        List<Course> courseList = new ArrayList<>();

        Student student = studentRepository.findById(id).get();
        studentDto.setName(student.getName());
        studentDto.setEmail(student.getEmail());


        for (Course course : student.getCourses()) {
            Course newCourse = new Course(course.getCourseName(), course.getCourseCode());
            courseList.add(newCourse);
        }
        studentDto.setCourseList(courseList);

        return studentDto;
    }

//    public String getStudentWithAddressById(Long id) {
//        Address student = addressRepository.findById(id).get();
//
////        StudentDto studentDto = new StudentDto();
////        studentDto.setName(student.getName()).setEmail(student.getEmail())
////                .setAddressDivision(student.getAddress().getDivision())
////                .setAddressCity(student.getAddress().getCity())
////                .setAddressPostalCode(student.getAddress().getPostalCode());
//
//        addressRepository.delete(student);
//        return "studentDto deleted";
//    }
}
