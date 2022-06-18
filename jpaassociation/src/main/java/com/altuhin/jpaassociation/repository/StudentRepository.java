package com.altuhin.jpaassociation.repository;

import com.altuhin.jpaassociation.entiry.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}