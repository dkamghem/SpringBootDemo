package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test")
	public String test() {	
		return "Welcome to Spring Boot";
	}
	
	@GetMapping("/{x}")
	public ResponseEntity<String> pathEndPoint(@PathVariable int x){
		ResponseEntity<String> res = new ResponseEntity<String>("The Path is " + x, HttpStatus.OK);
		return res;
	}
}
