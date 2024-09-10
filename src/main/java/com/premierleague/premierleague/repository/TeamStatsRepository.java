package com.premierleague.premierleague.repository;

import com.premierleague.premierleague.domain.entity.team.TeamStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamStatsRepository extends JpaRepository<TeamStats, Long> {
    TeamStats findByTeamId(Long teamId);
}
