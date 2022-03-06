package com.projectone.employees;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.projectone.employee.Employee;
import com.projectone.employee.EmployeeJPAResource;

class EmployeeJPATest {
	@Mock
	EmployeeJPAResource employeeController = Mockito.mock(EmployeeJPAResource.class);
	
	static List<Employee> employeeList1 = new ArrayList<Employee>();
	static List<Employee> employeeList2 = new ArrayList<Employee>();
	static List<Employee> employeeList3 = new ArrayList<Employee>();
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		employeeList1.add(new Employee());
		
		employeeList2.add(new Employee());
		employeeList2.add(new Employee());
		
		employeeList3.add(new Employee());
	}

	@Test
	void test() {
		when(employeeController.retrieveAllEmployees()).thenReturn(Stream
				.of(new Employee(),new Employee()).collect(Collectors.toList()));
		assertEquals(2, employeeController.retrieveAllEmployees().size());
	}

}
