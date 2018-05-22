package com.bru.sci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bru.sci.ado.CarDAO;
import com.bru.sci.model.User;
@Service
public class CarServiceiml implements CarService{
	@Autowired
	private CarDAO Cardao;
	
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.Cardao.findAll();
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return this.Cardao.find(id);
	}
	
}
