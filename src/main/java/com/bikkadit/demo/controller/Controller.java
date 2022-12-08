package com.bikkadit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.demo.response.Employee;
import com.bikkadit.demo.response.Flight;
import com.bikkadit.demo.service.EmployeeService;
import com.bikkadit.demo.service.FlightService;
@RestController
public class Controller {
	
	@Autowired
	public FlightService flightService;
	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/getFlightData")
	public void getFlightData() {
		flightService.getflightData();
	}
	
	@GetMapping(value="/allData",produces="application/json")
	public List<Flight> getAllData(){
		List<Flight> allData = flightService.getAllData();
		return allData;
		
	}
	@GetMapping(value="/getAllEmployees",produces="application/json")
	public List<Employee> getAllEmployees(){
		List<Employee> allEmployees = employeeService.getAllEmployees();
		return allEmployees;
		
	}
	


}
