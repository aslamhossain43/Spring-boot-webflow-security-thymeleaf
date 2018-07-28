package com.renu.bootwebflowsecuritythymeleaf.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;


@Entity
public class Like {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotBlank
	private String likeType;
	@ManyToMany(mappedBy="likes")

	private List<Post>posts;
	public Like() {
		// TODO Auto-generated constructor stub
	}

	public Like(@NotBlank String likeType) {
		super();
		this.likeType = likeType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLikeType() {
		return likeType;
	}

	public void setLikeType(String likeType) {
		this.likeType = likeType;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
