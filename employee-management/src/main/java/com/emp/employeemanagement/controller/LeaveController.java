package com.emp.employeemanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.entity.Leave;
import com.emp.employeemanagement.icontroller.ILeaveController;
import com.emp.employeemanagement.iservice.ILeaveService;

@RestController
@RequestMapping("leave")
public class LeaveController implements ILeaveController {

	@Autowired
	private ILeaveService leaveService;

	@Override
	public Leave applyLeave(@Valid @RequestBody Leave leave) {
		// TODO Auto-generated method stub
		return leaveService.applyLeave(leave);
	}

	@Override
	public Iterable<Leave> getLeaveByEmpId(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return leaveService.getLeaveByEmpId(id);
	}
	


}
