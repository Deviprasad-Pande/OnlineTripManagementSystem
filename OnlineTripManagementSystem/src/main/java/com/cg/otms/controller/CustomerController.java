package com.cg.otms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.otms.entities.Customer;
import com.cg.otms.entities.LoginBean;
import com.cg.otms.services.ICustomerService;

/**
 * 
 * Controller class for testing CustomerServiceImpl
 *
 */
@RestController
//@CrossOrigin("*")
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	
	
	@PostMapping("/addcustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.OK);
	}

	@GetMapping("/getcustomers")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<>(customerService.updateCustomer(customer), HttpStatus.OK);
	}

	@DeleteMapping("/deletecustomerbyid/{id}")
	public Customer deleteCustomer(@PathVariable int id) {
		return customerService.delete(customer.id);
	}

	@GetMapping("/getcustomerbyid/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
		Customer customer = customerService.getCustomerById(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@GetMapping("/getcustomerbyname/{name}")
	public ResponseEntity<List<Customer>> getCustomerById(@PathVariable String name) {
		List<Customer> customer = customerService.getCustomersByName(name);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}

	@GetMapping("/validateCustomer")
	public Customer validateCustomer(@RequestBody LoginBean loginBean) {
		return customerService.validateCustomerByUsernameandPassword(loginBean.getUsername(),loginBean.getPassword());
	}
}
