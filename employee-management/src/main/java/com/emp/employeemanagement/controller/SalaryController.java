package com.emp.employeemanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.entity.Salary;
import com.emp.employeemanagement.icontroller.ISalaryController;
import com.emp.employeemanagement.iservice.ISalaryService;

@RestController
@RequestMapping("salary")
public class SalaryController implements ISalaryController{

	@Autowired
	private ISalaryService salaryService;
	
	@Override
	public Salary addSalary(@Valid Salary sal) {
		// TODO Auto-generated method stub
		return salaryService.addSalary(sal);
	}

	@Override
	public Iterable<Salary> listSalary() {
		// TODO Auto-generated method stub
		return salaryService.listSalary();
	}

}
