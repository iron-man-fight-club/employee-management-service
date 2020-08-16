package com.emp.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.employeemanagement.dao.ILeaveDao;
import com.emp.employeemanagement.entity.Leave;
import com.emp.employeemanagement.iservice.ILeaveService;

@Service
public class LeaveService implements ILeaveService{
	
	@Autowired
	private ILeaveDao leaveDao;

	@Override
	//@Transactional
	public Leave applyLeave(Leave leave) {
	
		return leaveDao.save(leave);
		
		}

	@Override
	public List<Leave> findAll() {
		return leaveDao.findAll();
	}
	
	@Override
	public Leave save(Leave leave) {
		return leaveDao.save(leave);
	}
}
	
