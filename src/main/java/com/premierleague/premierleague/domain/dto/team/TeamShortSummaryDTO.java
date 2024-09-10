package com.premierleague.premierleague.domain.dto.team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamShortSummaryDTO {
    private Long id;
    private String name;
    private String logoUrl;
    private String websiteUrl;
}
