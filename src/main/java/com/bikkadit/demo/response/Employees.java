package com.bikkadit.demo.response;

import java.util.List;

public class Employees {
	
	List<Employee> getAllEmployees;

	public List<Employee> getGetAllEmployees() {
		return getAllEmployees;
	}

	public void setGetAllEmployees(List<Employee> getAllEmployees) {
		this.getAllEmployees = getAllEmployees;
	}

	@Override
	public String toString() {
		return "Employees [getAllEmployees=" + getAllEmployees + "]";
	}

}
