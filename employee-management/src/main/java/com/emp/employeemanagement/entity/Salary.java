package com.emp.employeemanagement.entity;

import java.sql.Date;

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
@Table(name = "Salary_Details")
@Getter
@Setter
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "emp_id")
	private Integer empId;
	
	@Column(name = "salary_month")
	private String salaryMonth;
	
	@Column(name = "salary_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date salaryDate;
	
	@Column(name = "salary_amount")
	private Integer salaryAmount;
	
	

}
