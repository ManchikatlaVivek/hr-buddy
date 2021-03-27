package com.viveksolutions.hrbuddy.enums;

public enum EmployeeRole {

	DEVELOPER("Developer"), TESTER("Tester"), MANAGER("Manager"), LEAD("Lead"), CONTRACTOR("Contractor");

	public String role;

	EmployeeRole(String role) {
		this.role = role;
	}

}
