package com.premierleague.premierleague.domain.dto.playerstats;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerStatsForPlayerDetailsDTO {
    private Long id;              // Unique identifier for PlayerStats

    private String position;      // Position of the player
    private Integer goalsScored;  // Total goals scored by the player
    private Integer assists;       // Total assists made by the player
    private Integer matchesPlayed; // Total matches played by the player
    private Integer yellowCards;   // Total yellow cards received by the player
    private Integer redCards;      // Total red cards received by the player
    private Integer minutesPlayed;  // Total minutes played by the player
}
