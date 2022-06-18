package com.altuhin.jpaassociation.repository;

import com.altuhin.jpaassociation.entiry.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}