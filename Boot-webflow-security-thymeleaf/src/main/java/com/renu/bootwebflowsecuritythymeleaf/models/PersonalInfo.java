package com.renu.bootwebflowsecuritythymeleaf.models;

import java.io.IOException;
import java.io.Serializable;
import java.util.Base64;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;
@Entity
public class PersonalInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private byte[] imageContent;

	@NotBlank
	private String username;

	@NotBlank
	private String password;

	@NotBlank
	private String confirmPassword;

	@NotBlank
	private String firstname;

	@NotBlank
	private String lastname;

	
public PersonalInfo() {
	// TODO Auto-generated constructor stub
}
	
	
	public PersonalInfo(long id, byte[] imageContent, @NotBlank String username, @NotBlank String password,
		@NotBlank String confirmPassword, @NotBlank String firstname, @NotBlank String lastname) {
	super();
	this.id = id;
	this.imageContent = imageContent;
	this.username = username;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.firstname = firstname;
	this.lastname = lastname;
}


	public byte[] getImageContent() {
		return imageContent;
	}

	public String getImageBase64() {
		return Base64.getEncoder().encodeToString(imageContent);
	}

	public void setImage(MultipartFile image) throws IOException {
		this.imageContent = image.getBytes();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
