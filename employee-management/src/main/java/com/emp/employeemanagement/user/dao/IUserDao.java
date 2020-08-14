package com.emp.employeemanagement.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.employeemanagement.user.model.User;


public interface IUserDao extends JpaRepository<User, Integer> {

}
