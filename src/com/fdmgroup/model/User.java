package com.fdmgroup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
@NamedQueries({
	@NamedQuery(name = "user.findByUserName", query="Select u FROM User u WHERE u.username= :uname"),
	@NamedQuery(name = "user.findAll", query="Select u FROM User u"),
})

public class User {

	@Id
	@Column(name= "userid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	@Column(name= "username", unique=true, nullable=false, length=30)
	private String username;
	
	
	@Column(name= "firstname", nullable=false, length=32)
	private String firstname;
	
	@Column(name= "lastname", nullable=false, length=32)
	private String lastname;
	
	@Column(name= "pw", nullable=false, length=32)
	private String pw;
	
	public User(int userid, String username, String firstname, String lastname, String password) {
		super();
		this.id = userid;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.pw = password;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUserid() {
		return id;
	}
	public void setUserid(int userid) {
		this.id = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return pw;
	}
	public void setPassword(String password) {
		this.pw = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", password=" + pw + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	 
	
}
