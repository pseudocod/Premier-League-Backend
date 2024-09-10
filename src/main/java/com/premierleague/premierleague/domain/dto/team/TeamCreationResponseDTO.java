package com.premierleague.premierleague.domain.dto.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamCreationResponseDTO {
    private Long id;
    private String name;
    private String stadium;
    private String city;
    private String country;
    private String logoUrl;
    private String websiteUrl;
    private String description;
    private String coachName;
    private String history;
    private Integer foundedYear;
}
