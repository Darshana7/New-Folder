package com.te.springmvc;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public class MyController {
	
	@GetMapping("/test")
	public String test(Model model) {
		return "test";	
	}

	
	public String test2(ModelMap map) {
		String s="Kattappa";
		map.addAttribute("mama");
		return "test";
	}
}
