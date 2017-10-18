package com.pc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="register_mst_tbl")
public class Registration {
	@Id
	@Column(name="ID")
	@GeneratedValue
	private long id;
	@Column(name="NAME")
	private String name;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONENO")
	private long phoneno;
	@Column(name="PURPOSE")
	private String purpose ;
	@Column(name="PURPOSEDESCRIPTION")
	private String purposedescription;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPurposedescription() {
		return purposedescription;
	}
	public void setPurposedescription(String purposedescription) {
		this.purposedescription = purposedescription;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", email=" + email
				+ ", phoneno=" + phoneno + ", purpose=" + purpose
				+ ", purposedescription=" + purposedescription + "]";
	}
	public Registration(long id, String name, String email, long phoneno,
			String purpose, String purposedescription) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.purpose = purpose;
		this.purposedescription = purposedescription;
	}
	public Registration() {
		super();
	}
	
	
	
	

}
