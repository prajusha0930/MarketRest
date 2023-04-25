package com.example.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/signin")
	public String signin()
	{
		return "Signinin page is Successfull ";
	}
    
    @GetMapping("/landingpage/{username}")
    public String landingpage(@PathVariable ("username") String username)
    {
    	return "The Landing page of the user"+username;
    }
}
