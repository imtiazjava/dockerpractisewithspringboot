package com.cgi.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.main.model.Employee;
import com.cgi.main.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		 
		return this.employeeRepository.save(employee);
	}

	public Employee getEmployeeById(Long id) {
		Optional<Employee> op=this.employeeRepository.findById(id);
		if(op.isPresent()) {
			return op.get();
		}else {
			return null;
		}
	}
}
