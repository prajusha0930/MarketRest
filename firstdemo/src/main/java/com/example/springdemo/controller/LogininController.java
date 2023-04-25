package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogininController {

    @GetMapping("/login")
	public String login()
	{
		return("Praju");
	}
}
