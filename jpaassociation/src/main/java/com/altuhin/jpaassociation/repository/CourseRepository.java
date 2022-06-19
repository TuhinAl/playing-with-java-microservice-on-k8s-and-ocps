package com.altuhin.jpaassociation.repository;

import com.altuhin.jpaassociation.entiry.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}