package com.pharmacy.customer.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.customer.domain.entity.Customer;;


public interface CustomerService {
    void createCustomer (Customer customer);
    void updateCustomer (Customer customer);
    Customer deleteCustomer (String idcustomer);
    Optional<Customer> findCustomerById(String idcustomer);
    List<Customer> findAllCustomers();
}
