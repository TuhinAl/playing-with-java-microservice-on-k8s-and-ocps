package com.altuhin.jpaassociation.controller;

import com.altuhin.jpaassociation.dto.StudentDto;
import com.altuhin.jpaassociation.entiry.Address;
import com.altuhin.jpaassociation.entiry.Student;
import com.altuhin.jpaassociation.repository.AddressRepository;
import com.altuhin.jpaassociation.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;
    private final AddressRepository addressRepository;

    @PostMapping("/save")
    public Student saveStudent(StudentDto studentDto) {
        Address address = new Address();
        address.setCity(studentDto.getAddressCity()).setDivision(studentDto.getAddressDivision())
                .setPostalCode(studentDto.getAddressPostalCode());

        Student student = new Student();
        student.setName(studentDto.getName()).setEmail(student.getEmail()).setAddress(address);
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/{id}")
    public StudentDto getStudentWithAddressById(@PathVariable Long id) {

        Student student = studentRepository.findById(id).get();

        StudentDto studentDto = new StudentDto();
        studentDto.setName(student.getName()).setEmail(student.getEmail())
                .setAddressDivision(student.getAddress().getDivision())
                .setAddressCity(student.getAddress().getCity())
                .setAddressPostalCode(student.getAddress().getPostalCode());
        return studentDto;
    }

}
