package com.klu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainusers")
public class TrainUsers {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	@Column(unique = true,nullable = false)
	public long rollno;
	@Column(unique = true,nullable = false)
	public String ownerEmail;
	@Column(unique = false,nullable = false)
	public String companyname;
	@Column(unique = false,nullable = false)
	public String accessCode;
	@Column(unique = false,nullable = true)
	public String ClientId;
	@Column(unique = false,nullable = true)
	public String clientSecret;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getOwnerEmail() {
		return ownerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getClientId() {
		return ClientId;
	}
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	@Override
	public String toString() {
		return "TrainUsers [id=" + id + ", rollno=" + rollno + ", ownerEmail=" + ownerEmail + ", companyname="
				+ companyname + ", accessCode=" + accessCode + ", ClientId=" + ClientId + ", clientSecret="
				+ clientSecret + "]";
	}
	
	
	
	
	
	
}
