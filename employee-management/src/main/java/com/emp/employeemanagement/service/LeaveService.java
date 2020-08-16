package com.emp.employeemanagement.service;

import javax.validation.Valid;

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
	public Leave applyLeave(@Valid Leave leave) {
	
		return leaveDao.save(leave);
		
		}

	@Override
	public Iterable<Leave> getLeaveByEmpId(Integer id) {
		// TODO Auto-generated method stub
		return leaveDao.findByEmpId(id);
	}

	}
	
