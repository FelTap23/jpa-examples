package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Team;
import com.example.demo.repository.TeamRepository;

@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamReporistory;
	
	
	@GetMapping(value = "/team")
	public List<Team> getListOfTeams(){
		return teamReporistory.findAll();
	}
	
	@PostMapping(value = "/team")
	public ResponseEntity<Team> createTeam(@RequestBody Team team) {
		
		Team teamResponse = teamReporistory.save(team);
		if(teamResponse.getId() != null) {
			return new ResponseEntity<>(team,HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
