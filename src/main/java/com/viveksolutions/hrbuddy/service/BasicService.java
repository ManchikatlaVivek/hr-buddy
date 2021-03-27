package com.viveksolutions.hrbuddy.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.viveksolutions.hrbuddy.beans.Employee;
import com.viveksolutions.hrbuddy.enums.EmployeeRole;
import com.viveksolutions.hrbuddy.enums.EmployeeSalary;
import com.viveksolutions.hrbuddy.enums.EmployeeTeam;

@Service
public class BasicService {

	private static Long counter = 0L;
	private static List<Employee> list = Arrays.asList(
			new Employee(++counter, "ravi", EmployeeRole.DEVELOPER.role, EmployeeTeam.ENGINEERING.team,
					EmployeeSalary.MEDIUM.salary),
			new Employee(++counter, "abdul", EmployeeRole.CONTRACTOR.role, EmployeeTeam.SALES.team,
					EmployeeSalary.LARGE.salary),
			new Employee(++counter, "sheela", EmployeeRole.LEAD.role, EmployeeTeam.SUPPORT.team,
					EmployeeSalary.BASIC.salary));

	public List<Employee> getAllEmployees() {
		return list;
	}

}
