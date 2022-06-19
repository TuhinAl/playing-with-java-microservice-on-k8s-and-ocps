package com.altuhin.jpaassociation.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class StudentDto {

    private String name;
    private String email;
    private String addressCity;
    private String addressDivision;
    private String addressPostalCode;
}
