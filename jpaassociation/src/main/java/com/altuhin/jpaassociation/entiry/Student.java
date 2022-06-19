package com.altuhin.jpaassociation.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "email")
    private String email;


    //1-M unidirectional

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Course> courses;

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "address_id",nullable = false)
//    private Address address;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
//        this.address = address;
    }

    public Student(String name, String email, List<Course> courses) {
        this.name = name;
        this.email = email;
        this.courses = courses;
    }
}
