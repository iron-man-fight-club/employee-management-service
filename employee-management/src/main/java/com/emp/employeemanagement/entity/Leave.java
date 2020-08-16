package com.emp.employeemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Leave_Details")
@Getter
@Setter
public class Leave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "emp_id")
	private Integer empId;
	
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
	
	@Column(name = "leaveStatus")
	private Boolean leaveStatus;



}
