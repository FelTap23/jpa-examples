package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class League {
	
	private long leagueId;
	private String leagueName;
	private List<Jornada> jorndadaList;
	
	public League() {
		this.jorndadaList = new ArrayList<Jornada>();
	}

	public League(long leagueId, String leagueName) {
		this.leagueId = leagueId;
		this.leagueName = leagueName;
		jorndadaList = new ArrayList<Jornada>();
	}
	
	public long getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(long leagueId) {
		this.leagueId = leagueId;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public List<Jornada> getJorndadaList() {
		return jorndadaList;
	}

	public void setJorndadaList(List<Jornada> jorndadaList) {
		this.jorndadaList = jorndadaList;
	}
	
	public void addJornada(Jornada jornada) {
		jorndadaList.add(jornada);
	}

	@Override
	public String toString() {
		return "League [leagueId=" + leagueId + ", leagueName=" + leagueName + ", jorndadaList=" + jorndadaList + "]";
	}
}
