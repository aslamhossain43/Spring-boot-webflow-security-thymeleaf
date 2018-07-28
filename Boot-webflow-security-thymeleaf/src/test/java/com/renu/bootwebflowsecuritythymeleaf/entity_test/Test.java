package com.renu.bootwebflowsecuritythymeleaf.entity_test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.renu.bootwebflowsecuritythymeleaf.BootWebflowSecurityThymeleafApplication;
import com.renu.bootwebflowsecuritythymeleaf.models.Like;
import com.renu.bootwebflowsecuritythymeleaf.models.Post;
import com.renu.bootwebflowsecuritythymeleaf.repository.CommentReoisitory;
import com.renu.bootwebflowsecuritythymeleaf.repository.LikeRepository;
import com.renu.bootwebflowsecuritythymeleaf.repository.PostRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=BootWebflowSecurityThymeleafApplication.class)
@WebAppConfiguration
public class Test {

	@Autowired
	private LikeRepository likeRepository;
	@Autowired
	private CommentReoisitory commentReoisitory;
	@Autowired
	private PostRepository postRepository;
	
	@org.junit.Test
	public void test() {
		/*Post post=new Post("personal post", "Hello World");
		Like like=new Like("Love");
		like.setPost(post);
        post.setLike(like);
		postRepository.save(post);*/
		
		
		/*
		Post post=postRepository.findAll().get(0);
		
		postRepository.deleteById(post.getId());
		*/
		
		/*Post post1=new Post("personal post","good job");
		Post post2=new Post("personal post","good job");
		
		
		
		Like like1=new Like("love1");
		Like like2=new Like("love1");
		
		post1.getLikes().add(like1);
		post2.getLikes().add(like2);
		
		
	postRepository.save(post1);
		postRepository.save(post2);
*/
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
