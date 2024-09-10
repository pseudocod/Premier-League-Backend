package com.premierleague.premierleague.domain.dto.teamstats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatsDTO {
    private Integer matchesPlayed;
    private Integer wins;
    private Integer draws;
    private Integer losses;
    private Integer goalsScored;
    private Integer goalsConceded;
    private Integer goalDifference;
    private Integer points;
    private Integer position;
    private Integer yellowCards;
    private Integer redCards;
}
