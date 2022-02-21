package com.projectone.employees;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.projectone.employee.Employee;

class EmployeeTests {

	
		static Employee t, u, v;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		t = new Employee();
		u = t;
		v = new Employee();
	}

	@Test
	void equalsTest() {
		assertEquals(t,u);
		assertEquals(t.hashCode(), u.hashCode());
	}

	@Test
	public void testUsername() {
		t.setUsername("benjb546");
		assertEquals(t.getUsername(), u.hashCode());
	}
	
	@Test
	public void testFirstName() {
		t.setFirstName("robert");
		assertEquals(t.getFirstName(),"robert");
	}
	
}
