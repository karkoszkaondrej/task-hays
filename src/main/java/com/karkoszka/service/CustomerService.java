package com.karkoszka.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karkoszka.model.Customer;
import com.karkoszka.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    // getting a specific record
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).get();
    }

    public void saveOrUpdate(Customer student) {
        customerRepository.save(student);
    }

    // deleting a specific record
    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
