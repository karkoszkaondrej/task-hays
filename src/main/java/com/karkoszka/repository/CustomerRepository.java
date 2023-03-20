package com.karkoszka.repository;

import org.springframework.data.repository.CrudRepository;

import com.karkoszka.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
