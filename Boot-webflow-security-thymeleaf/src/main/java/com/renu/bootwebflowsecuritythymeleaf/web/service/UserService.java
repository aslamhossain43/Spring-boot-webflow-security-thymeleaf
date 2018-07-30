
package com.renu.bootwebflowsecuritythymeleaf.web.service;

import com.renu.bootwebflowsecuritythymeleaf.web.model.User;

public interface UserService {
  void saveUser(User user,String[] roles);
  User findByUsername(String username);
}
