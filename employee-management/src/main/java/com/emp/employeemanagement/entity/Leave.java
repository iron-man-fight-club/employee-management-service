package com.emp.employeemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "leave_employee")
public class Leave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "leave_title")
	private String leaveTitle;
	
	@Column(name = "leave_desc")
	private String leaveDesc;
	
	@Column(name = "leave_apply_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date leaveApplyDate;
	
	@Column(name = "leave_start_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date leaveStartDate;
	
	@Column(name = "leave_end_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date leaveEndDate;
	
	@Column(name = "leave_status")
	private boolean leaveStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getLeaveTitle() {
		return leaveTitle;
	}

	public void setLeaveTitle(String leaveTitle) {
		this.leaveTitle = leaveTitle;
	}

	public String getLeaveDesc() {
		return leaveDesc;
	}

	public void setLeaveDesc(String leaveDesc) {
		this.leaveDesc = leaveDesc;
	}

	public Date getLeaveApplyDate() {
		return leaveApplyDate;
	}

	public void setLeaveApplyDate(Date leaveApplyDate) {
		this.leaveApplyDate = leaveApplyDate;
	}

	public Date getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public boolean isLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(boolean leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	
	public Leave() {}

}
