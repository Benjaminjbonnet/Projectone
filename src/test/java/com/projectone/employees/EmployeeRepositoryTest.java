package com.projectone.employees;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import com.projectone.employee.Employee;
import com.projectone.employee.EmployeeRepository;

class EmployeeRepositoryTest {
	@Mock
	EmployeeRepository employeeRepositoryTest = Mockito.mock(EmployeeRepository.class);
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void checkifEmployeeExistByUsername() {
		//given
		String username = "testing";
		Employee employee = new Employee();
		employee.setAboutMe("testing");;

		employee.setDob("11/11/11");
		employee.setFirstName("test");
		employee.setLastName("test");
		employee.setPassword("test");
		employee.setUsername("testing");
		employee.setEmail("testing@email");
		employeeRepositoryTest.save(employee);
		//when 
		List<Employee> exists = employeeRepositoryTest.findByUsername(username);
		//then
		assertThat(exists).isNotNull();
	}

}
