package com.atd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atd.model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
}
