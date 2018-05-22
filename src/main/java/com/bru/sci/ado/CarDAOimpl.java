package com.bru.sci.ado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bru.sci.model.User;
@Repository
public class CarDAOimpl implements CarDAO{
 @Autowired
	private JdbcTemplate JdbcTemplate ;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.JdbcTemplate.query("SELECT * FROM public.users",
				new BeanPropertyRowMapper<User>(User.class));
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return (User) this.JdbcTemplate.queryForObject("SELECT * FROM public.users WHERE id=?",
				new BeanPropertyRowMapper<User>(User.class),id);
	}
 
}
