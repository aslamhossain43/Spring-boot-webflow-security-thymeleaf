package com.renu.bootwebflowsecuritythymeleaf.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotBlank
	private String commenter;
	@NotBlank
	private String comment;
	
	
	
	public Comment() {
		// TODO Auto-generated constructor stub
	}
	public Comment(@NotBlank String commenter, @NotBlank String comment) {
		super();
		this.commenter = commenter;
		this.comment = comment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
	
	
	
	
}
