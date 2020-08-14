package com.emp.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.employeemanagement.entity.Role;

public interface IRoleDao extends JpaRepository<Role, Integer>{

}
