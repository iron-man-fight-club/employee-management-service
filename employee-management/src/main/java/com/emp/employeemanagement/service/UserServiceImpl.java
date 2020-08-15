package com.emp.employeemanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.employeemanagement.dao.IUserDao;
import com.emp.employeemanagement.entity.User;
import com.emp.employeemanagement.iservice.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao iUserDao;

	@Override
	@Transactional
	public List<User> findAll() {
		return iUserDao.findAll();
	}

}
