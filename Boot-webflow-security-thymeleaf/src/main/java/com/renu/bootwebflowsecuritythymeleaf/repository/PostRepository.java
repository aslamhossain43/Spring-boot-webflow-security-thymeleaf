package com.renu.bootwebflowsecuritythymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renu.bootwebflowsecuritythymeleaf.models.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
