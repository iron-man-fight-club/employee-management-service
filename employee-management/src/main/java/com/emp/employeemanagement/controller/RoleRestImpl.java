package com.emp.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.dao.IRoleDao;
import com.emp.employeemanagement.entity.Role;

@RestController
@RequestMapping(path = "/role")
public class RoleRestImpl {
	
	@Autowired
	private IRoleDao iRoleDao;
	
	@GetMapping(path="/findAll")
	public List<Role> findAll(){
		return iRoleDao.findAll();
	}
	
}
