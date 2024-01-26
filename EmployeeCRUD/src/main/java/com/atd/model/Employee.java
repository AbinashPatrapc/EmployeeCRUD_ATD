package com.atd.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ATD_EMPLOYEE")
@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "employee_seq", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_NAME", length = 50)
	private String empName;
	
	@Column(name = "EMP_DESIGNATION", length = 50)
	private String empDesg;
	
	@Column(name = "EMP_ADDRS", length = 50)
	private String empAddrs;
}
