package com.premierleague.premierleague.domain.dto.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerForTeamPresentationDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String position;
    private Integer age;
    private Integer number;
    private String profilePictureUrl;
}
