package com.jenkin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String Welcome()
	{
		return "Wecome Jenkins Demo!";
	}

}
