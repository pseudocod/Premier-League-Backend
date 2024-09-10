package com.premierleague.premierleague.domain.entity.fixture;

import com.premierleague.premierleague.domain.entity.match.Match;
import com.premierleague.premierleague.domain.entity.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fixture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id", referencedColumnName = "id")
    private Team homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_team_id", referencedColumnName = "id")
    private Team awayTeam;

    private String description;

    private String stadium;

    private LocalDateTime fixtureDate; // Date and time of the fixture

    private String season;
    private String matchWeek;

    private boolean isPlayed;

    @OneToOne(mappedBy = "fixture", fetch = FetchType.LAZY)
    private Match match;
}
