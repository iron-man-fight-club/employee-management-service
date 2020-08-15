package com.emp.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.dao.IRoleDao;
import com.emp.employeemanagement.entity.Role;
import com.emp.employeemanagement.iservice.IRoleService;

@RestController
@RequestMapping(path = "/role")
public class RoleRestImpl {
	
	@Autowired
	private IRoleService iRoleService;
	
	@GetMapping(path="/findAll")
	public List<Role> findAll(){
		return iRoleService.findAll();
	}
	
}
