package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Team {
	@Id
	@GeneratedValue
	private Integer id;
	@Column( name = "name_team", length = 25)
	private String nameTeam;
		
	public Team(Integer id, String nameTeam) {
		this.id = id;
		this.nameTeam = nameTeam;
	}

	public Team() {
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameTeam() {
		return nameTeam;
	}
	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", nameTeam=" + nameTeam + "]";
	}	
}
