package com.emp.employeemanagement.icontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.emp.employeemanagement.entity.Employee;

public interface IEmployeeController {
	
	@GetMapping("all")
	List<Employee> findAllEmployees();
}
