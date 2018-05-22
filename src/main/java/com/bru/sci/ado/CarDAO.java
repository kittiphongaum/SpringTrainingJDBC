package com.bru.sci.ado;


import java.util.List;

import com.bru.sci.model.User;


public interface CarDAO {
 
	public List<User> findAll() ;
	public User find(int id);


}
