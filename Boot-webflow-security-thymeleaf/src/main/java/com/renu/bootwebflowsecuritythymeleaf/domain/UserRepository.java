package com.renu.bootwebflowsecuritythymeleaf.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.renu.bootwebflowsecuritythymeleaf.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByUserName(String username);
    
}