package com.te.cookies1;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(String username, Model model, HttpServletResponse res) {
		model.addAttribute("name", username);
		Cookie cookie = new Cookie("name", username);
		res.addCookie(cookie);
		return "welcome";
	}
	
	@GetMapping("/inbox")
	public String getInbox(@CookieValue String name, Model model) {
		model.addAttribute("data",name);
		return "inbox";
	}
	

}
