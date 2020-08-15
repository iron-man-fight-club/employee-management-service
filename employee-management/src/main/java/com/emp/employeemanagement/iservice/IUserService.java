package com.emp.employeemanagement.iservice;

import java.util.List;

import com.emp.employeemanagement.entity.User;

public interface IUserService {
	public List<User> findAll();
}
