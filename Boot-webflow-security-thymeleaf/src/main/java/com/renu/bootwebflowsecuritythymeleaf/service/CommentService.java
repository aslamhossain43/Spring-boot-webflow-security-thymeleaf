package com.renu.bootwebflowsecuritythymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renu.bootwebflowsecuritythymeleaf.models.Comment;
import com.renu.bootwebflowsecuritythymeleaf.repository.CommentReoisitory;

@Service
@Transactional
public class CommentService {

	@Autowired
	private final CommentReoisitory commentReoisitory;

	public CommentService(CommentReoisitory commentReoisitory) {
		super();
		this.commentReoisitory = commentReoisitory;
	}

	public boolean save(Comment comment) {

		try {
			commentReoisitory.save(comment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<Comment> getAll() {
		List<Comment> comments = new ArrayList<>();
		for (Comment comment : commentReoisitory.findAll()) {
			comments.add(comment);
		}
		return comments;

	}

	public boolean deleteById(long id) {

		try {
			commentReoisitory.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	public boolean update(Comment comment) {

		try {
			commentReoisitory.save(comment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

}
