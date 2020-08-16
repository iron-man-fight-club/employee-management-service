package com.emp.employeemanagement.iservice;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;

import com.emp.employeemanagement.entity.Salary;

public interface ISalaryService {
	
	public Salary addSalary(@Valid @RequestBody Salary id);
	
	public Iterable<Salary> listSalary();

}
