package com.premierleague.premierleague.controllers;

import com.premierleague.premierleague.domain.dto.team.TeamCreateDTO;
import com.premierleague.premierleague.domain.dto.team.TeamCreationResponseDTO;
import com.premierleague.premierleague.service.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<TeamCreationResponseDTO> createTeam(@RequestBody TeamCreateDTO teamCreateDTO) {
        try{
            TeamCreationResponseDTO teamCreationResponseDTO = teamService.createTeam(teamCreateDTO);
            return ResponseEntity.ok(teamCreationResponseDTO);
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return ResponseEntity.badRequest().build();
        }
    }
}
