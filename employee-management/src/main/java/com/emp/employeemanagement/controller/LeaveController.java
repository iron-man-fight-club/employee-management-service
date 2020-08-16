package com.emp.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employeemanagement.entity.Leave;
import com.emp.employeemanagement.icontroller.ILeaveController;
import com.emp.employeemanagement.iservice.ILeaveService;

@RestController
@RequestMapping("/leave")
public class LeaveController implements ILeaveController {

	@Autowired
	private ILeaveService leaveService;

	@Override
	public Leave applyLeave(Leave leave) {
		// TODO Auto-generated method stub
		return leaveService.applyLeave(leave);
	}
	
	@GetMapping(path="/findAll")
	public List<Leave> findAll(){
		return leaveService.findAll();
	}
	
	@PostMapping(path="/save")
	public Leave save(@RequestBody Leave leave){
		return leaveService.save(leave);
	}

	@GetMapping(path="/findByEmpId/{id}")
	public Iterable<Leave> getLeaveByEmpId(@PathVariable(name="id") Integer id) {
		// TODO Auto-generated method stub
		return leaveService.getLeaveByEmpId(id);
	}

}
