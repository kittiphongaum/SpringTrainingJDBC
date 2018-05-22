package com.bru.sci.service;

import java.util.List;

import com.bru.sci.model.User;

public interface CarService {
	
	public List<User> findAll() ;
	public User find(int id);

}
