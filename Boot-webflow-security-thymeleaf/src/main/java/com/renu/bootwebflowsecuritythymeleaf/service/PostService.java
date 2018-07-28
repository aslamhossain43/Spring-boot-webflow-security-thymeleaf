package com.renu.bootwebflowsecuritythymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.renu.bootwebflowsecuritythymeleaf.models.Post;
import com.renu.bootwebflowsecuritythymeleaf.repository.PostRepository;

@Service
@Transactional
public class PostService {

	private final PostRepository postRepository;

	public PostService(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	public boolean save(Post post) {

		try {
			postRepository.save(post);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	public List<Post> getAll() {

		List<Post> posts = new ArrayList<>();
		for (Post post : postRepository.findAll()) {

			posts.add(post);
		}
		return posts;

	}

	public boolean deleteById(long id) {

		try {
			postRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	public boolean update(Post post) {

		try {
			postRepository.save(post);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}
	
	
	
	
	

}
