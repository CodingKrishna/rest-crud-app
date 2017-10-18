package com.pc.bean;

public class RegistrationBean {
	
	private String name;
	private String email;
	private String purpose;
	private String purposedescription;
	
	private long phoneno;

	public RegistrationBean() {
		super();
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

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}


}
