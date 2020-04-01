package com.cts.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class Customer {
	@NotNull(message="name is required")
	private String name;
	@NotNull(message="address is required")
	private String address;
	@NotNull(message="dob is required")
	private Date dob;
	private String gender;
	private String country;
	public Customer() {
		
	}
	public Customer(String name, String address, Date dob, String gender, String country) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
