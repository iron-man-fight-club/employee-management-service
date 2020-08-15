package com.emp.employeemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "leave")
public class Leave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "empId")
	private int empId;
	
	@Column(name = "leaveTitle")
	private String leaveTitle;
	
	@Column(name = "leaveDesc")
	private String leaveDesc;
	
	@Column(name = "leaveApplyDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date leaveApplyDate;
	
	@Column(name = "leaveStartDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date leaveStartDate;
	
	@Column(name = "leaveEndDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date leaveEndDate;
	
	@Column(name = "leaveStatus")
	private boolean leaveStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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

}
