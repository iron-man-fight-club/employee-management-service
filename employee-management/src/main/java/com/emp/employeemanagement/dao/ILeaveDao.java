package com.emp.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.employeemanagement.entity.Leave;

@Repository
public interface ILeaveDao extends JpaRepository<Leave, Integer>{

}
