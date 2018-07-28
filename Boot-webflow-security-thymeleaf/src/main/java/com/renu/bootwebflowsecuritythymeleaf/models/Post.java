package com.renu.bootwebflowsecuritythymeleaf.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;



@Entity
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NotBlank(message="Please enter post name")
	private String postName;
	@NotBlank
	private String description;
   @ManyToMany(cascade= {CascadeType.PERSIST,
		   CascadeType.MERGE})
	@JoinTable(name="post_like",joinColumns=@JoinColumn(name="post_id"),
	inverseJoinColumns=@JoinColumn(name="like_id"))
   private List<Like> likes=new ArrayList<>();
  
   
	public Post() {
		
	}

	public Post(@NotBlank(message = "Please enter post name") String postName, @NotBlank String description) {
		super();
		this.postName = postName;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Like> getLikes() {
		return likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
