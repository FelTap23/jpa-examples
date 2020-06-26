package com.example.demo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Jornada {
	private int jordadaId;
	private LocalDate start;
	private LocalDate end;
	private List<Match> listMatch;
	
	public Jornada() {
		listMatch = new ArrayList<>();
	}
	
	public Jornada(int jordadaId, LocalDate start, LocalDate end) {
		this.listMatch = new ArrayList<>();
		this.jordadaId = jordadaId;
		this.start = start;
		this.end = end;
	}
	public int getJordadaId() {
		return jordadaId;
	}
	public void setJordadaId(int jordadaId) {
		this.jordadaId = jordadaId;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	public List<Match> getListMatch() {
		return listMatch;
	}
	public void setListMatch(List<Match> listMatch) {
		this.listMatch = listMatch;
	}
	
	public void addMatch(Match match) {
		listMatch.add(match);
	}

	@Override
	public String toString() {
		return "Jornada [jordadaId=" + jordadaId + ", start=" + start + ", end=" + end + ", listMatch=" + listMatch
				+ "]";
	}
}
