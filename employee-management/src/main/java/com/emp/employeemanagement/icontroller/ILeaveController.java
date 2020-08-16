package com.emp.employeemanagement.icontroller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emp.employeemanagement.entity.Leave;

public interface ILeaveController {

	@PostMapping("apply")
	public Leave applyLeave(@Valid @RequestBody Leave leave);
	
	@GetMapping(value="/get/{id}")
	public Iterable<Leave>	getLeaveByEmpId(@PathVariable Integer id);
}
