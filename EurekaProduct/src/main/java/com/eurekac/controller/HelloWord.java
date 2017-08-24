package com.eurekac.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWord {

	@RequestMapping("/pro")
	public String getstring()
	{
		return "hello product1";
	}
}
