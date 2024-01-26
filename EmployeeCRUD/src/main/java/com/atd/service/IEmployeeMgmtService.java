package com.atd.service;

import java.util.List;

import com.atd.model.Employee;

public interface IEmployeeMgmtService {
	
	public List<Employee> getAllEmployee();

	public String addEmployee(Employee emp);

	public String deleteEmployee(int id);

	public String updateEmployee(Employee emp);

	public Employee getEmployeeById(int id);
}
