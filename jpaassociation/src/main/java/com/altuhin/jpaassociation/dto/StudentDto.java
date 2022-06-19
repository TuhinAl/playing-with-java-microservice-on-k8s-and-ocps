package com.altuhin.jpaassociation.dto;

import com.altuhin.jpaassociation.entiry.Course;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@Getter
@Setter
public class StudentDto {

    private String name;
    private String email;
    private String addressCity;
    private String addressDivision;
    private String addressPostalCode;
    private List<Course> courseList;
}
