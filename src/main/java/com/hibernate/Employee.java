package com.hibernate;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name")
	private String name;
	@Column(name = "job_roll")
	private String jobRoll;
	@Column(name = "employee_salary")
	private double salary;
	
	
	
	public Employee(String name, String jobRoll, double salary) {
		super();
		
		this.name = name;
		this.jobRoll = jobRoll;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobRoll() {
		return jobRoll;
	}
	public void setJobRoll(String jobRoll) {
		this.jobRoll = jobRoll;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", jobRoll=" + jobRoll + ", salary=" + salary + "]";
	}
	
	
}
