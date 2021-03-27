package com.viveksolutions.hrbuddy.enums;

public enum EmployeeTeam {
	ENGINEERING("Engineering"), SUPPORT("Support"), SALES("Sales");

	public String team;

	private EmployeeTeam(String team) {
		this.team = team;
	}
}
