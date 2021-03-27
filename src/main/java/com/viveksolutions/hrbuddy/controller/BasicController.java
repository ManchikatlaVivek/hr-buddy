package com.viveksolutions.hrbuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viveksolutions.hrbuddy.beans.Employee;
import com.viveksolutions.hrbuddy.service.BasicService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicController {
	
	@Autowired
	private BasicService basicService;
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return basicService.getAllEmployees();
	}
}
