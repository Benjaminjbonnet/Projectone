package com.projectone.reimbursements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ReimbursementJPAResource {
	
	@Autowired
	private ReimbursementRepository remRepo;
	
	@GetMapping("/reimbursements")
	public List<Reimbursements> refrieveAllReimbursements(){
		return remRepo.findAll();
		
	}
	
	@PostMapping("/reimbursements/newreimbursement")
	public Reimbursements newReimbursement(@RequestBody Reimbursements reimbursement) {
		Reimbursements newReimbursement = remRepo.save(reimbursement);
		return newReimbursement;
		
	}
	
	@PutMapping("/update")
	public Reimbursements saveOrUpdateReimbursements(@RequestBody Reimbursements reimbursement) {
		Reimbursements updatedReimbursement = remRepo.save(reimbursement);
		
			
		return updatedReimbursement;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteReimbursement(@PathVariable Long id) {
		remRepo.deleteById(id);
		
	}
	
	
}
