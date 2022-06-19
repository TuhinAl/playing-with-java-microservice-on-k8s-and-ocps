package com.altuhin.jpaassociation.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "division")
    private String division;

    @Column(name = "postal_code")
    private String postalCode;

//    @OneToOne(mappedBy = "address", cascade = {CascadeType.DETACH,
//            CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private Student student;

    public Address(String city, String division, String postalCode) {
        this.city = city;
        this.division = division;
        this.postalCode = postalCode;
    }
}
