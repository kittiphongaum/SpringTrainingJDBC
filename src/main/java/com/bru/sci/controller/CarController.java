package com.bru.sci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bru.sci.model.User;
import com.bru.sci.service.CarService;

@RestController
@RequestMapping("/")
public class CarController {

	
	
	
	@Autowired
	private CarService  CarService;
	@GetMapping("/user")
	public List<User> getUser(){
		return  CarService.findAll();
	}
		
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", CarService.findAll());
		 return "product/index";

	}
}
	
	

