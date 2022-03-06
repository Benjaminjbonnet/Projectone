package com.projectone.employee;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EmployeeJPAResource {
	Logger logger = LoggerFactory.getLogger(EmployeeJPAResource.class);
	@Autowired
	private EmployeeRepository emp;
	
	static List<Employee> loggedInUser = new ArrayList<Employee>();
	
	
	@GetMapping("/employees")
	public List<Employee> retrieveAllEmployees(){
		logger.info("Returning All Employees");
		return emp.findAll();
	}

	
	@PostMapping("/register")
	public Employee registerEmployee(@RequestBody Employee employee) {
		Employee newEmployee = emp.save(employee);
		logger.info("Return new Employee" + employee );
		return newEmployee;
		
	}
	@PostMapping("/login")
	public List<Employee> employeelogin(@RequestBody Employee employee) {
		String usernameJs = employee.getUsername();
		List<Employee> userFromDatabase = emp.findByUsername(usernameJs);
		logger.info("returning user"+userFromDatabase );
		loggedInUser.addAll(userFromDatabase);
		return userFromDatabase;
		
	}
	@GetMapping("/get-logged-in-user")
	public List<Employee> getLoggedInUser(){
		
		return loggedInUser;
	}

}
