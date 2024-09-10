package com.premierleague.premierleague.domain.dto.team;

import com.premierleague.premierleague.domain.dto.player.PlayerForTeamPresentationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamDetailsDTO {
    private Long id;
    private String name;
    private String stadium;
    private String city;
    private String country;
    private String logoUrl;
    private String websiteUrl;
    private String coachName;
    private Integer foundedYear;
    private String description;
    private String history;
    private List<PlayerForTeamPresentationDTO> players;
}
