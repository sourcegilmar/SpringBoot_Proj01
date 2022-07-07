package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Serializable is important when we have to transform our datas in bytes chain
 * Because the object (in this case) will pass through the net or it'll transform in
 * a field of database and so forth.
 */

/*
 * Insert @Id and ..
 * Import Entity from javax persistence
 */

@Entity
public class User implements Serializable {
	
	/*
	 * The serialVersionUID is necessary because our object will be serializable.
	 * In order words, it is obliged to has a serial number. 
	 * L after the number show that number is "long" instead "int". This notation
	 * help to avoid some type of exception
	 */
	private static final long serialVersionUID = 1L;
	
	// The same way you have to choose javax persistence to
	// @Id notation as well.
	// @GeneratedValue annotation implement auto increment numbers in
	// primary key when some insertion operation
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	public User() {
		
	}

	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "User datas\n"+
				"id......: "+id+
				"Name....: "+name+
				"Email...: "+email+
				"Phone...: "+phone+
				"Password: "+password;
	}	

}
