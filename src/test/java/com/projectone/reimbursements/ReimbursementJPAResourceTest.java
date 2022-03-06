package com.projectone.reimbursements;

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


class ReimbursementJPAResourceTest {

	
	@Mock
	ReimbursementJPAResource reimbursementJPAResource = Mockito.mock(ReimbursementJPAResource.class);
	
	static List<Reimbursements> reimbursementList1 = new ArrayList<Reimbursements>();
	static List<Reimbursements> reimbursementList2 = new ArrayList<Reimbursements>();
	static List<Reimbursements> reimbursementList3 = new ArrayList<Reimbursements>();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		reimbursementList1.add( new Reimbursements());
		
		reimbursementList2.add( new Reimbursements());
		reimbursementList1.add( new Reimbursements());
		
		reimbursementList3.add( new Reimbursements());
		reimbursementList3.add( new Reimbursements());
		
		
	}

	@Test
	void getReimbursementByIdTest() {
		when(reimbursementJPAResource.refrieveAllReimbursements()).thenReturn(Stream
				.of(new Reimbursements(), new Reimbursements()).collect(Collectors.toList()));
				}

}
