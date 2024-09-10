package com.premierleague.premierleague.domain.entity.news;

import com.premierleague.premierleague.domain.entity.player.Player;
import com.premierleague.premierleague.domain.entity.team.Team;
import com.premierleague.premierleague.domain.entity.appuser.AppUser;
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
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    private String imageUrl; // Optional field, consider validating the URL format

    @Column(nullable = false, updatable = false) // Prevent updates after creation
    private LocalDateTime publishedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private AppUser author; // User who authored the news

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", referencedColumnName = "id", nullable = true)
    private Team team; // Team that the news is about (nullable)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id", referencedColumnName = "id", nullable = true)
    private Player player; // Player that the news is about (nullable)

    @PrePersist
    protected void onCreate() {
        this.publishedAt = LocalDateTime.now();
        // Validation logic to ensure only one of team or player is set
        if (team != null && player != null) {
            throw new IllegalStateException("News article must be about either a team or a player, not both.");
        }
    }
}
