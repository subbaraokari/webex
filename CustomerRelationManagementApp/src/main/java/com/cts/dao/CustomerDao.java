package com.cts.dao;

import java.util.List;

import com.cts.model.Customer;

public interface CustomerDao {
	public boolean insert(Customer customer);
	public boolean update(int cid,Customer customer);
	public Customer get(int cid);
	public List<Customer> getCustomers();
}
