package com.emp.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.employeemanagement.dao.EmployeeDao;
import com.emp.employeemanagement.entity.Employee;
import com.emp.employeemanagement.iservice.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	private EmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = employeeDao.findAll();
		return list;
	}

}
