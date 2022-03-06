package com.projectone.reimbursements;

import java.util.ArrayDeque;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.projectone.employee.Employee;

import lombok.Data;
@Entity
@Table(name = "reimbursements", schema = "public")
public @Data class Reimbursements {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "reimbursementid")
		private Long reimbursementId;
		
		@Column(name =" status")
		private String status;
		@Column(name = "amount")
		private double amount;
		@Column(name = "description")
		private String description;
		@Column(name="type")
		private String type;
		@Column(name = "resolvetime")
		private String resolvetime;
		
		@Column(name = "username")
		private String username;
		@Column(name="id")
		private Long userId;
}
