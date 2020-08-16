package com.emp.employeemanagement.iservice;

import javax.validation.Valid;

import com.emp.employeemanagement.entity.Leave;

public interface ILeaveService {

	public Leave applyLeave(@Valid Leave leave);

	public Iterable<Leave> getLeaveByEmpId(Integer id);
 
}
