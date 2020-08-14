package com.emp.employeemanagement.user.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.user.dao.IUserDao;
import com.emp.employeemanagement.user.model.User;

@RestController
@RequestMapping(path="/user")
public class UserRestImpl {
	
	@Autowired
	private IUserDao iUserDao;
	
	@GetMapping(path="/hello")
	public String getHello() {
		return "hello";
	}
	@GetMapping(path="/findAll")
	public List<User> getUser() {
		return iUserDao.findAll();
	}
}
