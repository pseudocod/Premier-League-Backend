package com.premierleague.premierleague.domain.dto.player;

import com.premierleague.premierleague.domain.dto.playerstats.PlayerStatsForPlayerDetailsDTO;
import com.premierleague.premierleague.domain.dto.team.TeamSummaryForPlayerDTO;
import com.premierleague.premierleague.domain.entity.team.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDetailsDTO {
    private Long id;

    private String firstName;
    private String lastName;
    private Integer age;
    private String nationality;
    private LocalDate dateOfBirth;
    private Integer number;
    private Double height; // in meters
    private Double weight; // in kilograms
    private Double marketValue; // in your chosen currency
    private Double salary; // in your chosen currency
    private String profilePictureUrl;

    private TeamSummaryForPlayerDTO team; // The team this player is associated with
    private PlayerStatsForPlayerDetailsDTO playerStats; // Assuming you have a PlayerStatsDTO to represent the player's stats
}
