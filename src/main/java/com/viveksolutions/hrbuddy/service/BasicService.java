package com.viveksolutions.hrbuddy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.viveksolutions.hrbuddy.beans.Employee;
import com.viveksolutions.hrbuddy.enums.EmployeeRole;
import com.viveksolutions.hrbuddy.enums.EmployeeSalary;
import com.viveksolutions.hrbuddy.enums.EmployeeTeam;

@Service
public class BasicService {

	private static Long counter = 0L;
	private static List<Employee> list = new ArrayList<Employee>();
	static {
		list.add(new Employee(++counter, "ravi", EmployeeRole.DEVELOPER.role, EmployeeTeam.ENGINEERING.team,
				EmployeeSalary.MEDIUM.salary));
		list.add(new Employee(++counter, "abdul", EmployeeRole.CONTRACTOR.role, EmployeeTeam.SALES.team,
				EmployeeSalary.LARGE.salary));
		list.add(new Employee(++counter, "sheela", EmployeeRole.LEAD.role, EmployeeTeam.SUPPORT.team,
				EmployeeSalary.BASIC.salary));
	}

	public List<Employee> getAllEmployees() {
		return list;
	}

	public Employee getEmployee(Long id) {
		Optional<Employee> employee = findEmployee(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}

	private Optional<Employee> findEmployee(Long id) {
		return list.stream().filter(item -> item.getId().equals(id)).findAny();
	}

	public Employee addEmployee(Employee employee) {
		employee.setId(++counter);
		list.add(employee);
		return employee;
	}

	public boolean deleteEmployee(Long id) {
		Optional<Employee> deleteEmp = findEmployee(id);
		if (deleteEmp.isPresent()) {
			System.out.println(deleteEmp.get().toString());
			return list.remove(deleteEmp.get());
		} else {
			return false;
		}
	}

	public Employee updateEmployee(Employee employee) {
		Optional<Employee> temp = findEmployee(employee.getId());
		if(temp.isPresent()) {
			list.remove(temp.get());
		}
		list.add(employee);
		return employee;
	}

}
