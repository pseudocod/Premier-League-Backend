package com.premierleague.premierleague.domain.dto.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerCreateDTO {
    private String firstName;

    private String lastName;

    private Integer age;

    private String nationality;

    private LocalDate dateOfBirth;

    private Integer number; // Optional, can be null for new players

    private Double height; // Optional, can be null
    private Double weight; // Optional, can be null
    private Double marketValue; // Optional, can be null
    private Double salary; // Optional, can be null
    private String profilePictureUrl; // Optional, can be null

    private Long teamId; // This can be used to associate the player with a team during creation
}
