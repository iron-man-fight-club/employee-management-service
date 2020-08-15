package com.emp.employeemanagement.icontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emp.employeemanagement.entity.Leave;

public interface ILeaveController {

	@PostMapping(value = "/apply")
	public Leave applyLeave(@RequestBody Leave leave);
	
}
