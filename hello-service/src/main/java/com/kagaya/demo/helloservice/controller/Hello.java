package com.kagaya.demo.helloservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
 
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(String name) {
		return "Hello, " + name;
	}

}
