package com.premierleague.premierleague.domain.entity.player;

import com.premierleague.premierleague.domain.entity.team.Team;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false)
    private String nationality;
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    private Integer number;

    private Double height; //  in meters
    private Double weight; //  in kilograms

    private Double marketValue;
    private Double salary;

    private String profilePictureUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;

    @OneToOne(mappedBy = "player", fetch = FetchType.LAZY)
    private PlayerStats playerStats;
}
