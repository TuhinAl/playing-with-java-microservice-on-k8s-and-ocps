package com.altuhin.jpaassociation.repository;

import com.altuhin.jpaassociation.entiry.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}