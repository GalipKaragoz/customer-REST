package com.bibek.customersvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bibek.customersvc.models.Customer;
import com.bibek.customersvc.services.CustomerService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping
	public ArrayList<Customer> getCustomers(){
		return customerService.getCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
		
	}
	
	@GetMapping("/search")
	public List<Customer> searchCustomer(@RequestParam String name) {
		return customerService.searchCustomer(name);
	}
	
	@PostMapping
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
		
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable String id) {
		return customerService.updateCustomer(customer);
		
	}
	
	@DeleteMapping
	public void deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomer(id);
	}
}
