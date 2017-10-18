package com.pc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Known {
	@Id
	@Column(name="id")
	private long id;
	@Column(name="KNOWN_THROUGH")
	private String knownthrough;
	@OneToOne(targetEntity=Registration.class,cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="ID" ,name="userId")
	private Registration register;
	

}
