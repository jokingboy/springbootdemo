package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {
	
	@RequestMapping("/hello")
	public 	@ResponseBody String hello() {
		return "Hello, Spring boot!";
	}
}
