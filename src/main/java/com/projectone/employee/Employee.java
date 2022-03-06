package com.projectone.employee;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.projectone.reimbursements.Reimbursements;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table (name = "employee", schema = "public")
@Data
public  class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long userId;
	@Column (name = "firstname")
	private String firstName;
	@Column (name = "lastname")
	private String lastName;
	@Column (name = "username")
	private String username;
	@Column (name= "email")
	private String email;
	@Column (name="password")
	private String password;
	@Column (name = "dob")
	private String dob;
	@Column (name = "aboutme")
	private String aboutMe;
	@Column
	private String profilepic;
	@OneToMany(targetEntity = Reimbursements.class,cascade = CascadeType.ALL) 
	@JoinColumn(name="cp_fk",referencedColumnName = "id" )
	    private List<Reimbursements> reimbursements; 
	
}
