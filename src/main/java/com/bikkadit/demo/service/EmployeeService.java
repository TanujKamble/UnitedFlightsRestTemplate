package com.bikkadit.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bikkadit.demo.response.Employee;
import com.bikkadit.demo.response.Employees;
@Service
public class EmployeeService {
	
	public List<Employee> getAllEmployees(){
		RestTemplate rt=new RestTemplate();
		
		String url="localhost:9090/getAllEmployee";
		ResponseEntity<Employees> forEntity = rt.getForEntity(url, Employees.class);
		Employees body = forEntity.getBody();
		List<Employee> getAllEmployees = body.getGetAllEmployees();
		
		for (Employee emp:getAllEmployees) {System.out.println(emp);}
		return getAllEmployees;
		
	}

}
