package com.altuhin.jpaassociation.service;

import com.altuhin.jpaassociation.dto.StudentDto;
import com.altuhin.jpaassociation.entiry.Address;
import com.altuhin.jpaassociation.entiry.Student;
import com.altuhin.jpaassociation.repository.AddressRepository;
import com.altuhin.jpaassociation.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final AddressRepository addressRepository;

    public Student saveStudent(StudentDto studentDto) {
//        Address address = new Address(studentDto.getAddressCity(), studentDto.getAddressDivision(),studentDto.getAddressPostalCode());

//        Address save = addressRepository.save(address);
        Student student = new Student(studentDto.getName(), studentDto.getEmail());
        studentRepository.save(student);
        return student;
    }

    public String getStudentWithAddressById(Long id) {
        Address student = addressRepository.findById(id).get();

//        StudentDto studentDto = new StudentDto();
//        studentDto.setName(student.getName()).setEmail(student.getEmail())
//                .setAddressDivision(student.getAddress().getDivision())
//                .setAddressCity(student.getAddress().getCity())
//                .setAddressPostalCode(student.getAddress().getPostalCode());

        addressRepository.delete(student);
        return "studentDto deleted";
    }
}
