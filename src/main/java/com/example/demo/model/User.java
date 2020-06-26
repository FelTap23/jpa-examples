package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.demo.model.enums.Gender;

@Entity
public class User {
	@Id
	@GeneratedValue
	@Column(name= "id",  nullable = false)
	private Integer id;
	@Column(name="name", length = 25)
	private String name;
	@Column(name="last_name", length = 25)
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="gender", length = 10)
	private Gender gender;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
