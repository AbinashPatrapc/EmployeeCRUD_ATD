package com.atd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atd.model.Employee;
import com.atd.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeRepo emprepo;

	@Override
	public List<Employee> getAllEmployee() {
		return emprepo.findAll();
	}

	@Override
	public String addEmployee(Employee emp) {
		int val = emprepo.save(emp).getEmpId();
		return "Employee Registered With " + val + " Employee Id";
	}

	@Override
	public String deleteEmployee(int id) {
		emprepo.deleteById(id);
		return " Employee having id :: " + id + " has been Deleted Successfully";
	}

	@Override
	public String updateEmployee(Employee emp) {
		int val = emprepo.save(emp).getEmpId();
		return " Emp Id:: " + val + " Employee Data is Updated";
	}

	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> opt = emprepo.findById(id);
		Employee emp = null;
		if (opt.isPresent()) {
			emp = opt.get();
		}
		return emp;
	}

}
