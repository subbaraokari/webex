package com.cts;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class CustomerRelationManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRelationManagementAppApplication.class, args);
	}
	@Bean
	public DataSource driverManagerDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/crmapp");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

}
