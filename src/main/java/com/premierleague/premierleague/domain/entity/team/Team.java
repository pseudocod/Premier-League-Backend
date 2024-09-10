package com.premierleague.premierleague.domain.entity.team;

import com.premierleague.premierleague.domain.entity.match.Match;
import com.premierleague.premierleague.domain.entity.player.Player;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String stadium;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String logoUrl;
    @Column(nullable = false)
    private String websiteUrl;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String coachName;
    @Column(nullable = false)
    private String history;
    @Column(nullable = false)
    private Integer foundedYear;


    @OneToMany(mappedBy = "team", fetch = FetchType.LAZY)
    private List<Player> players;

    @OneToOne(mappedBy = "team", fetch = FetchType.LAZY)
    private TeamStats teamStats;

    @OneToMany(mappedBy = "homeTeam")
    private List<Match> homeMatches;

    @OneToMany(mappedBy = "awayTeam")
    private List<Match> awayMatches;
}
