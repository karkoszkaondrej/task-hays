package com.karkoszka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karkoszka.service.CustomerService;
import com.karkoszka.model.Customer;

@RestController
public class CustomerController {
    
    @Autowired
    CustomerService customerService;

    // creating a get mapping that retrieves the detail of a specific customer
    @GetMapping("/customer/{id}")
    private Customer getCustomer(@PathVariable("id") int id) {
        return customerService.getCustomerById(id);
    }

    // creating delete mapping that deletes a specific customer
    @DeleteMapping("/customer/{id}")
    private void deleteCustomer(@PathVariable("id") int id) {
        customerService.delete(id);
    }

    // creating post mapping that post the customer detail in the database
    @PostMapping("/customer")
    private int saveCustomer(@RequestBody Customer customer) {
        customerService.saveOrUpdate(customer);
        return customer.getId();
    }
}
