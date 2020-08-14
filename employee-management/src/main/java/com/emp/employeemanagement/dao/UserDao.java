package com.emp.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.employeemanagement.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
