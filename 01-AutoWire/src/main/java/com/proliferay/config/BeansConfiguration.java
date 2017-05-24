package com.proliferay.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proliferay.pojo.Company;
import com.proliferay.pojo.Employee;
/**
 * 
 * @author hamidul.islam
 *
 */
@Configuration
public class BeansConfiguration {
	@Bean
	public Company company() {
		return new Company();
	}
	
	
	
	@Bean
	public Employee employee1(){
		Employee employee = new Employee();
		employee.setAge(30);
		employee.setFirstName("Hamidul1"); 
		employee.setLastName("Islam1");
		return employee;
	}
	
	
	
	@Bean
	public Employee employee(){
		Employee employee = new Employee();
		employee.setAge(30);
		employee.setFirstName("Hamidul"); 
		employee.setLastName("Islam");
		return employee;
	}
}
