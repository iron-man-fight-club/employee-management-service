package com.emp.employeemanagement.icontroller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emp.employeemanagement.entity.Salary;

public interface ISalaryController {
	
	@PostMapping(value="/add")
	public Salary addSalary(@Valid @RequestBody Salary id);
	
	@GetMapping(value="/list")
	public Iterable<Salary> listSalary();

}
