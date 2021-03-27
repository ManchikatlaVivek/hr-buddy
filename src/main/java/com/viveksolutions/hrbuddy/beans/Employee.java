package com.viveksolutions.hrbuddy.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

	private Long id;
	private String name;
	private String role;
	private String team;
	private int salary;

	public Employee(Long id, String name, String role, String team, int salary) {
		this.id = id;
		this.name = name;
		this.role = role;
		this.team = team;
		this.salary = salary;
	}

	public Employee() {
	}

}
