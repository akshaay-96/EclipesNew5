package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class HomeController {

	
	  @GetMapping("/hotel") 
	  public String hotel()
	  {
		  return "Now Successful...!!";
		  
	  }
	  
	  @GetMapping("/lodge")
	  public String saveData(@RequestBody Product p) {
		  
		  return "Data inserted";
	  }
	 
}
