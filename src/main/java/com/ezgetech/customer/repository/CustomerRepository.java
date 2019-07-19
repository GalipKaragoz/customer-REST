package com.ezgetech.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ezgetech.customer.models.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	List<Customer> findAllByFirstname(String first_name);

}
