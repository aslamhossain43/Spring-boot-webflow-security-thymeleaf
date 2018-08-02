package com.renu.bootwebflowsecuritythymeleaf.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.bootwebflowsecuritythymeleaf.web.model.User;
import com.renu.bootwebflowsecuritythymeleaf.web.service.SecurityService;
import com.renu.bootwebflowsecuritythymeleaf.web.service.UserService;

@Controller
public class WebController {
	@Autowired
	UserService userService;

	@Autowired
	SecurityService securityService;

	@RequestMapping(value = "/main")
	public String main() {
		return "sec-main";
	}

	@RequestMapping("/login")
	public String login(Model model, String error, String logout, HttpServletRequest request) {
		if (logout != null) {
			model.addAttribute("logout", "You have been logged out successfully.");
		}
		return "sec-login";
	}

	@RequestMapping(value = "/loginError")
	public String loginError(Model model, String username) {
		model.addAttribute("error", "Your username and password is invalid.");
		model.addAttribute("username", username);
		return "sec-login";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		model.addAttribute("userForm", new User());
		return "sec-registration";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model,
			String[] roles) {
		String password = userForm.getPassword();
		userService.saveUser(userForm, roles);
		securityService.autologin(userForm.getUsername(), password);
		return "redirect:/main";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "sec-admin";
	}

	@RequestMapping("/user")
	public String user() {
		return "sec-user";
	}

	@RequestMapping("/403")
	public String access() {
		return "sec-access";
	}
}
