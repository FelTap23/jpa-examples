package com.example.demo.logic;

import java.util.LinkedList;
import java.util.Queue;

import com.example.demo.model.Jornada;
import com.example.demo.model.League;
import com.example.demo.model.Match;

public class LeagueEngine {
	
	private static Jornada assembleJornada(int matches[][], int size, int jornadaId) {
		Jornada jornada = new Jornada(jornadaId, null, null);
		for(int i =0; i < size; i++) {
			Match match = new Match(jornadaId,matches[0][i], matches[1][i],null);
			jornada.addMatch(match);
		}
		return jornada;
	}

	public static League createLigue(int numberOfTeams, String name) {
		League league = new League(0, name);
		Queue<Integer> queueEngine = new LinkedList<>();
		int[][] matches = null;
		int size = 0;
		int engine = 0;

		if ((numberOfTeams % 2) == 0) {
			size = numberOfTeams / 2;
			engine = numberOfTeams;
		} else {
			size = (numberOfTeams + 1) / 2;
			engine = numberOfTeams + 1;
		}

		matches = new int[2][size];
		for (int i = 1; i < engine; i++) {
			queueEngine.add(i);
		}

		for (int counter = 0; counter < queueEngine.size(); counter++) {
			Queue<Integer> auxQueue = new LinkedList<>(queueEngine);
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < size; j++) {
					if (!(i == 0 && j == 0)) {
						matches[i][j] = auxQueue.poll();
					}
				}
			}
			
			Integer element = queueEngine.poll();
			queueEngine.add(element);
			league.addJornada(assembleJornada(matches, size, counter));
		}
		
		return league;
	}
}
