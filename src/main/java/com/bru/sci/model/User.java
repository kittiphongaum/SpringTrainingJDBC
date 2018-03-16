package com.bru.sci.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="users")
public class User {
 
    @Id
    @GeneratedValue
    private long id;
     
    private String email;
     
    private String password;
    private String passwordcofiom;
     
    public String getPasswordcofiom() {
		return passwordcofiom;
	}

	public void setPasswordcofiom(String passwordcofiom) {
		this.passwordcofiom = passwordcofiom;
	}

	@OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="role",
    joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")},
    inverseJoinColumns={@JoinColumn(name="car_id", referencedColumnName="id")})
    private Car car;
     
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
     
}