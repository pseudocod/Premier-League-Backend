package com.premierleague.premierleague.domain.dto.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamCreateDTO {
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
}
