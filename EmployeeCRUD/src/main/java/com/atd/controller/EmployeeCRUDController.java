package com.atd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atd.model.Employee;
import com.atd.service.IEmployeeMgmtService;


@RestController
public class EmployeeCRUDController {
	@Autowired
	private IEmployeeMgmtService service;

	//Select Employee API
	@GetMapping("/select")
	public ResponseEntity<?> showEmployeeReport() {
		return new ResponseEntity<>(service.getAllEmployee(),HttpStatus.OK);
	}
	
	//Insert Employee API
	@PostMapping("/insert")
	public ResponseEntity<String> addStudent(@RequestBody Employee emp) {
		return new ResponseEntity<>(service.addEmployee(emp),HttpStatus.CREATED);
	}
	
	//Delete Employee API
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestParam("rollNo")int empid) {
		return new ResponseEntity<>(service.deleteEmployee(empid),HttpStatus.OK);
	}
	
	//Employee Update API
	@PostMapping("/update")
	public ResponseEntity<String> editEmployee(@RequestBody Employee emp) {
		return new ResponseEntity<>(service.updateEmployee(emp),HttpStatus.OK);
	}
	
	//select particular Employee By EmpId API
	@PostMapping("/getEmployee")
	public ResponseEntity<?> getStudentByROll(@RequestParam("rollNo") int empid) {
		return new ResponseEntity<>(service.getEmployeeById(empid),HttpStatus.OK);
	}
	
	
}
