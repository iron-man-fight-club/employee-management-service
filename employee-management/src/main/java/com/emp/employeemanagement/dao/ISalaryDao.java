package com.emp.employeemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.employeemanagement.entity.Salary;

@Repository
public interface ISalaryDao extends JpaRepository<Salary, Integer> {

}
