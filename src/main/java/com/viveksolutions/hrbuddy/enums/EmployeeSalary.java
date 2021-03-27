package com.viveksolutions.hrbuddy.enums;

public enum EmployeeSalary {

	BASIC(10), MEDIUM(100), LARGE(1000);

	public int salary;

	EmployeeSalary(int salary) {
		this.salary = salary;
	}

}
