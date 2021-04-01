package com.viveksolutions.hrbuddy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return basicService.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return basicService.addEmployee(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public boolean deleteEmployee(@PathVariable Long id) {
		return basicService.deleteEmployee(id);
		
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return basicService.updateEmployee(employee);
	}
}
