package com.codegym.service.iml;

import com.codegym.model.Customer;
import com.codegym.prepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findName(Customer customer) {
        return null;
    }
}
