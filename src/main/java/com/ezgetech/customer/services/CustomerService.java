package com.ezgetech.customer.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ezgetech.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezgetech.customer.models.Customer;

@Service
public class CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

	public ArrayList<Customer> getCustomers(){
		return (ArrayList<Customer>) customerRepository.findAll();
	}
	
	public Customer getCustomer(int id) {
		return customerRepository.findById(id).orElse(null);
	}
	
	public List<Customer> searchCustomer(String first_name) {
		return customerRepository.findAllByFirstname(first_name);
	}
	
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer updateCustomer(Customer customer) {
		customer.setUpdated_at(new Date());
		return customerRepository.save(customer);
	}
	
	public void deleteCustomer(int id) {
		customerRepository.deleteById(id);
	}
	
}
