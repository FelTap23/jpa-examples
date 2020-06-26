package com.example.demo.model;

import java.time.LocalDateTime;

public class Match {
	
	private int jornadaId;
	private int firstTeamId;
	private int secondTeamId;
	private LocalDateTime dateMatch;
	
	public Match() {
		
	}
	
	public Match(int jornadaId, int firstTeamId, int secondTeamId, LocalDateTime dateMatch) {
		this.jornadaId = jornadaId;
		this.firstTeamId = firstTeamId;
		this.secondTeamId = secondTeamId;
		this.dateMatch = dateMatch;
	}
	
	public int getJornadaId() {
		return jornadaId;
	}

	public void setJornadaId(int jornadaId) {
		this.jornadaId = jornadaId;
	}

	public int getFirstTeamId() {
		return firstTeamId;
	}

	public void setFirstTeamId(int firstTeamId) {
		this.firstTeamId = firstTeamId;
	}

	public int getSecondTeamId() {
		return secondTeamId;
	}

	public void setSecondTeamId(int secondTeamId) {
		this.secondTeamId = secondTeamId;
	}

	public LocalDateTime getDateMatch() {
		return dateMatch;
	}

	public void setDateMatch(LocalDateTime dateMatch) {
		this.dateMatch = dateMatch;
	}

	@Override
	public String toString() {
		return "Match [jornadaId=" + jornadaId + ", firstTeamId=" + firstTeamId + ", secondTeamId=" + secondTeamId
				+ ", dateMatch=" + dateMatch + "]";
	}
	
	
	
}
