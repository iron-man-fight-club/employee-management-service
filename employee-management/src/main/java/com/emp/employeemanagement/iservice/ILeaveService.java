package com.emp.employeemanagement.iservice;

import java.util.List;

import com.emp.employeemanagement.entity.Leave;

public interface ILeaveService {

	public Leave applyLeave(Leave leave);
	
	public List<Leave> findAll();
 
}
