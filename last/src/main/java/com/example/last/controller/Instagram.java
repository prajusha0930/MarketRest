package com.example.last.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Instagram {

	@GetMapping("/getpost")
	public String getPost(@RequestParam String username)
	{
		return "The post is" +username;
	}
}
