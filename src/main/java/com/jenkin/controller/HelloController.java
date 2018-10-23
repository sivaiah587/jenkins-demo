package com.jenkin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
	
	public String Welcome()
	{
		return "Wecome Jenkins Demo!";
	}

}
