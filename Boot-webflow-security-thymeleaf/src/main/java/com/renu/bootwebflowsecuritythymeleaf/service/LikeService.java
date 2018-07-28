package com.renu.bootwebflowsecuritythymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.renu.bootwebflowsecuritythymeleaf.models.Like;
import com.renu.bootwebflowsecuritythymeleaf.repository.LikeRepository;

@Service
@Transactional
public class LikeService {

	private final LikeRepository likeRepository;

	public LikeService(LikeRepository likeRepository) {
		super();
		this.likeRepository = likeRepository;
	}

	public boolean save(Like like) {

		try {
			likeRepository.save(like);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	public List<Like> getAll() {
		List<Like> likes = new ArrayList<>();
		for (Like like : likeRepository.findAll()) {
			likes.add(like);

		}
		return likes;

	}

	public boolean deleteById(long id) {
		try {
			likeRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	public boolean update(Like like) {

		try {
			likeRepository.save(like);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
