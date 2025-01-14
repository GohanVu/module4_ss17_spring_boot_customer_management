package com.codegym.practice_springbootcustomermanagement.repository;

import com.codegym.practice_springbootcustomermanagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}