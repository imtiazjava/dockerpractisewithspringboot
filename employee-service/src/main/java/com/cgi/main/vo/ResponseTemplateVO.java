package com.cgi.main.vo;

import com.cgi.main.model.Employee;

public class ResponseTemplateVO {

	private Employee employee;
	private Department department;
	public ResponseTemplateVO() {
		super();
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
