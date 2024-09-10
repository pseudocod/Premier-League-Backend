package com.premierleague.premierleague.domain.entity.team;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TeamStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id", nullable = false)
    private Team team; // Team who has these stats
}
