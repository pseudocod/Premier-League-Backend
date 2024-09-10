package com.premierleague.premierleague.domain.dto.playerstats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerStatsByPlayerIdDTO {
    private Long id;

    private String position;
    private Integer goalsScored;
    private Integer assists;
    private Integer matchesPlayed;
    private Integer yellowCards;
    private Integer redCards;
    private Integer minutesPlayed;
}
