package com.cg.otms.services;

import java.util.List;

import com.cg.otms.entities.Customer;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);

	public List<Customer> getAllCustomer();

	public Customer updateCustomer(Customer customer);

	public Customer delete(int id);

	public Customer getCustomerById(int id);

	public List<Customer> getCustomersByName(String name);

	public Customer validateCustomerByUsernameandPassword(String username, String password);
}