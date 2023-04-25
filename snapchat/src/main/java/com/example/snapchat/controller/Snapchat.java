package com.example.snapchat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Snapchat {

	@GetMapping("/login")
	public String getlogin(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("virat")&&password.equals("3006"))
		{
			return "Login Successfull";
		}
		else
		{
			return "Invalid user";
		}
	}
}
