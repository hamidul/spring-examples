package com.proliferay.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Company {
	
	/**
	 * By default it will look Employee type reference in spring context. If its found then auto wire it
	 * If there are multiple beans of the same type Employee in the spring context then auto wire by type will fail. 
	 * On failing it will look for employee bean id in the context 
	 */

	@Autowired
	Employee employee;

	public Employee getEmployee() {
		return employee;
	}	
}
