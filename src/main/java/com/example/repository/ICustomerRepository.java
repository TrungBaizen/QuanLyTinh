package com.example.repository;

import com.example.model.Customer;
import com.example.model.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}