package org.cts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CustomerDao;
import com.cts.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao dao;
	@Override
	public boolean insert(Customer customer) {
		return dao.insert(customer);
	}

	@Override
	public boolean update(int cid, Customer customer) {
		return dao.update(cid, customer);
	}

	@Override
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}

}
