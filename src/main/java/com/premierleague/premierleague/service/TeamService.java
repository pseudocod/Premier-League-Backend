package com.premierleague.premierleague.service;

import com.premierleague.premierleague.domain.dto.team.TeamCreateDTO;
import com.premierleague.premierleague.domain.dto.team.TeamCreationResponseDTO;
import com.premierleague.premierleague.domain.entity.team.Team;
import com.premierleague.premierleague.domain.entity.team.TeamStats;
import com.premierleague.premierleague.mapper.TeamMapper;
import com.premierleague.premierleague.repository.TeamRepository;
import com.premierleague.premierleague.repository.TeamStatsRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    private final TeamRepository teamRepository;
    private final TeamStatsRepository teamStatsRepository;

    public TeamService(TeamRepository teamRepository, TeamStatsRepository teamStatsRepository) {
        this.teamRepository = teamRepository;
        this.teamStatsRepository = teamStatsRepository;
    }

    @Transactional
    public TeamCreationResponseDTO createTeam(TeamCreateDTO teamCreateDTO) {
        Team team = TeamMapper.INSTANCE.toEntity(teamCreateDTO);

        TeamStats teamStats = TeamStats.builder()
                .matchesPlayed(0)
                .wins(0)
                .draws(0)
                .losses(0)
                .goalsScored(0)
                .goalsConceded(0)
                .goalDifference(0)
                .points(0)
                .redCards(0)
                .yellowCards(0)
                .team(team)
                .build();

        team.setTeamStats(teamStats);

        Team savedTeam = teamRepository.save(team);

        return TeamMapper.INSTANCE.toTeamCreationResponseDTO(savedTeam);
    }
}
