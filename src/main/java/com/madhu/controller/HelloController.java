package com.madhu.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Get";
	}
	
	@PostMapping("/welcome")
	public String welcome(@RequestParam String username,ModelMap map) {
		map.addAttribute("username", username);
		return "post";
	}
}
