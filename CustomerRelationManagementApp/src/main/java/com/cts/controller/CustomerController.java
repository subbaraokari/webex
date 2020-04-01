package com.cts.controller;

import java.util.List;

import org.cts.services.CustomerService;
import org.cts.services.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.model.Customer;

@Controller
public class CustomerController {
	CustomerService customerService;
	public CustomerController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired	
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/")
	public String getCustomers(Model model) {
		List<Customer> customers=customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "display";
	}
}
