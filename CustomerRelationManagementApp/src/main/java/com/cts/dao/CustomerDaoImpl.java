package com.cts.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.model.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	DataSource dataSource;
	@Override
	public boolean insert(Customer customer) {
		Connection con=null;
		PreparedStatement pst=null;
		int i=0;
		boolean b=false;
		try {
			con=dataSource.getConnection();
			pst=con.prepareStatement("insert into customer(name,address,dob,gender,country) values(?,?,?,?,?)");
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getAddress());
			pst.setDate(3, (Date) customer.getDob());
			pst.setString(4, customer.getGender());
			pst.setString(5, customer.getCountry());
			i=pst.executeUpdate();
			if(i>0)
				b=true;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	@Override
	public boolean update(int cid,Customer customer) {
		Connection con=null;
		PreparedStatement pst=null;
		int i=0;
		boolean b=false;
		try {
			con=dataSource.getConnection();
			pst=con.prepareStatement("update customer set name=?,address=?,dob=?,gender=?,country=? where cid=?");
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getAddress());
			pst.setDate(3, (Date) customer.getDob());
			pst.setString(4, customer.getGender());
			pst.setString(5, customer.getCountry());
			pst.setInt(6, cid);
			i=pst.executeUpdate();
			if(i>0)
			{
				b=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	@Override
	public Customer get(int cid) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Customer customer=null;
		try {
			con=dataSource.getConnection();
			pst=con.prepareStatement("select * from customer where cid=?");
			pst.setInt(1, cid);
			rs=pst.executeQuery();
			rs.next();
			customer=new Customer(rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Customer> customers=new ArrayList<Customer>();
		try {
			con=dataSource.getConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from customer");
			while(rs.next()) {
				customers.add(new Customer(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

}
