package com.bru.sci.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="cars")
public class Car {
	 @Id
	    @GeneratedValue
	    private long id;  
	    private String mid;	    
	    private String name;	    
	    private String address;
	     
	    @OneToMany(cascade=CascadeType.ALL)
	    @JoinTable(name="role",
	    joinColumns={@JoinColumn(name="car_id", referencedColumnName="id")},
	    inverseJoinColumns={@JoinColumn(name="user_id", referencedColumnName="id")})
	    private List<User> userList;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getMid() {
			return mid;
		}

		public void setMid(String mid) {
			this.mid = mid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public List<User> getUserList() {
			return userList;
		}

		public void setUserList(List<User> userList) {
			this.userList = userList;
		}  	
	     
}
	
	 

