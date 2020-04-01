package org.cts.services;

import java.util.List;

import com.cts.model.Customer;

public interface CustomerService {
	public boolean insert(Customer customer);
	public boolean update(int cid,Customer customer);
	public List<Customer> getCustomers();

}
