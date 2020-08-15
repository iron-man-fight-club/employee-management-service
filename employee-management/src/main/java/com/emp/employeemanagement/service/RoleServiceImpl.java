package com.emp.employeemanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.employeemanagement.dao.IRoleDao;
import com.emp.employeemanagement.entity.Role;
import com.emp.employeemanagement.iservice.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {
	
	@Autowired
	private IRoleDao iRoleDao;
	
	@Override
	@Transactional
	public List<Role> findAll() {
		return iRoleDao.findAll();
	}

}
