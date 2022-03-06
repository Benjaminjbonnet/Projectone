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
	void hashCodeTest() {
		assertEquals(t, u);
		assertEquals(t.hashCode(), u.hashCode());
	}

	@Test
	public void testUsername() {
		t.setUsername("benjb546");
		assertEquals(t.getUsername(), "benjb546");
	}
	
	@Test
	public void testFirstName() {
		t.setFirstName("robert");
		assertEquals(t.getFirstName(),"robert");
	}
	
	@Test void testLastName() {
		t.setLastName("Salazar");
		assertEquals(t.getLastName(),"Salazar");
		
	}
	
	@Test void testPassword() {
		t.setPassword("t123456");
		assertEquals(t.getPassword(), "t123456");
	}
	
	@Test void testEmail() {
		t.setEmail("test@test.com");
		assertEquals(t.getEmail(),"test@test.com");
	}
	@Test void testDob() {
		t.setDob("12/12/1991");
		assertEquals(t.getDob(),"12/12/1991");
	}
	@Test void testAboutME() {
		t.setAboutMe("Hello everyone this is a little fun fact about me");
		assertEquals(t.getAboutMe(), "Hello everyone this is a little fun fact about me");
	}
	
	@Test void EmployeeId() {
		t.setUserId(1l);
		assertEquals(t.getUserId(),1l);
		
	}

}
