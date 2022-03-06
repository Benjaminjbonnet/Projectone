package com.projectone.reimbursements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ReimbursementTest {
	
	static Reimbursements t,u;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		t = new Reimbursements();
		u = t;
		
	}

	@Test
	void equalsTest() {
		assertEquals(t,u);
		assertEquals(t.hashCode(), u.hashCode());
	}
	public void amountTest() {
		t.setAmount(0d);
		assertEquals(t.getAmount(),0d);
	}

	@Test
		public void descriptionTest() {
		t.setDescription("Compensation for the day");
		assertEquals(t.getDescription(),"Compensation for the day");
	}
	@Test
	public void reimbursementIdTest() {
		t.setReimbursementId(2l);
		assertEquals(t.getReimbursementId(),2l);
	}
	@Test void resolveTimeTest() {
		t.setResolvetime("12:00pm");
		assertEquals(t.getResolvetime(), "12:00pm");
	}
	@Test 
	public void statusTest() {
		t.setStatus("approved");
		assertEquals(t.getStatus(),"approved");
	}
	@Test
	public void typeTest() {
		t.setType("refund");
		assertEquals(t.getType(),"refund");
	}
	
}
