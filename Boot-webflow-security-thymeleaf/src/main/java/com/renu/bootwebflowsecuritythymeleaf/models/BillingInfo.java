package com.renu.bootwebflowsecuritythymeleaf.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
@Entity
public class BillingInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotBlank
	private String address;

	public BillingInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BillingInfo(long id, @NotBlank String address) {
		super();
		this.id = id;
		this.address = address;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}