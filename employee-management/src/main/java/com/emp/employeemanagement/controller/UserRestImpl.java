package com.emp.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.dao.UserDao;
import com.emp.employeemanagement.entity.User;

@RestController
@RequestMapping(path="/user")
public class UserRestImpl {
	
	@Autowired
	private UserDao iUserDao;
	
	@GetMapping(path="/hello")
	public String getHello() {
		return "hello";
	}
	@GetMapping(path="/findAll")
	public List<User> getUser() {
		return iUserDao.findAll();
	}
}
