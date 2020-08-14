package com.emp.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.entity.Employee;
import com.emp.employeemanagement.icontroller.IEmployeeController;
import com.emp.employeemanagement.iservice.IEmployeeService;

@RestController
@RequestMapping("emp")
public class EmployeeController implements IEmployeeController {

	@Autowired
	private IEmployeeService empService;
	
	@Override
	public List<Employee> findAllEmployees() {
		return empService.getAllEmployees();
	}

}
