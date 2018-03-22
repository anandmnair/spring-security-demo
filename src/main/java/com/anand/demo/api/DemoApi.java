package com.anand.demo.api;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApi {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello " + new Date();
	}

}
