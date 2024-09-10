package com.premierleague.premierleague.domain.entity.match;

import com.premierleague.premierleague.domain.entity.fixture.Fixture;
import com.premierleague.premierleague.domain.entity.team.Team;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id", referencedColumnName = "id")
    private Team homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_team_id", referencedColumnName = "id")
    private Team awayTeam;

    private String description; // e.g., "Match Summary"

    private Integer homeTeamGoals; // Use Integer to allow null values if the match hasn't occurred
    private Integer awayTeamGoals; // Use Integer to allow null values if the match hasn't occurred

    private LocalDateTime matchDate; // Use LocalDateTime for better date handling
    private String stadium; // Location of the match
    private String season; // e.g., "2023/2024"
    private String matchWeek; // e.g., "Week 1"

    @Enumerated(EnumType.STRING)
    private MatchStatus matchStatus; // Use enum for match status

    private String refereeName; // Corrected spelling

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fixture_id", referencedColumnName = "id")
    private Fixture fixture;
}
