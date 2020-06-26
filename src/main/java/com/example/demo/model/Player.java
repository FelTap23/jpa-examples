package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.demo.model.enums.BloodType;
import com.example.demo.model.enums.Gender;
import com.example.demo.model.enums.SoccerPosition;

public class Player {
	
	/*Basic Information*/
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 25)
	private String name;
	@Column(length = 25, name ="last_name")
	private String lastName;
	@Column(length = 25, name = "middle_name")
	private String middleName;
	
	@Column(nullable = false, name = "birth_date")
	private LocalDate birthDate;
	@Column(nullable =false,  length = 20, name = "phone_number")
	private String phoneNumber;
	private String email;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "blood_type", length = 12)
	private BloodType bloodType;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	
	@Enumerated(EnumType.STRING)
	private SoccerPosition position;
	private Integer number;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BloodType getBloodType() {
		return bloodType;
	}
	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public SoccerPosition getPosition() {
		return position;
	}
	public void setPosition(SoccerPosition position) {
		this.position = position;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
}
