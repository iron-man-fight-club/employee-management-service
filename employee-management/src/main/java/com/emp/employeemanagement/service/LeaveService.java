package com.emp.employeemanagement.service;

import org.springframework.stereotype.Service;

import com.emp.employeemanagement.dao.ILeaveDao;
import com.emp.employeemanagement.entity.Leave;
import com.emp.employeemanagement.iservice.ILeaveService;

@Service
public class LeaveService implements ILeaveService{

	private ILeaveDao leaveDao;

	@Override
	//@Transactional
	public Leave applyLeave(Leave leave) {
	
		return leaveDao.save(leave);
		
		}
	}
	
