package com.emp.employeemanagement.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.employeemanagement.dao.ISalaryDao;
import com.emp.employeemanagement.entity.Salary;
import com.emp.employeemanagement.iservice.ISalaryService;

@Service
public class SalaryService implements ISalaryService{
	
	@Autowired
	private ISalaryDao salaryDao;

	@Override
	public Salary addSalary(@Valid Salary sal) {
		// TODO Auto-generated method stub
		return salaryDao.save(sal);
	}

	@Override
	public Iterable<Salary> listSalary() {
		// TODO Auto-generated method stub
		return salaryDao.findAll();
	}

}
