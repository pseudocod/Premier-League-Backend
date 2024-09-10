package com.premierleague.premierleague.mapper;

import com.premierleague.premierleague.domain.dto.player.PlayerForTeamPresentationDTO;
import com.premierleague.premierleague.domain.dto.team.TeamDetailsDTO;
import com.premierleague.premierleague.domain.dto.team.TeamShortSummaryDTO;
import com.premierleague.premierleague.domain.dto.team.TeamWithPlayersDTO;
import com.premierleague.premierleague.domain.entity.player.Player;
import com.premierleague.premierleague.domain.entity.team.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;


@Mapper
public interface TeamMapper {
    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    TeamShortSummaryDTO toTeamShortSummaryDTO(Team team);

    @Mapping(source = "players", target = "players", qualifiedByName = "playersToPlayerForTeamDTO")
    TeamDetailsDTO toTeamDetailsDTO(Team team);

    @Mapping(source = "players", target = "players", qualifiedByName = "playersToPlayerForTeamDTO")
    TeamWithPlayersDTO toTeamWithPlayersDTO(Team team);

    default List<PlayerForTeamPresentationDTO> playersToPlayerForTeamDTO(List<Player> players) {
        return players.stream()
                .map(player -> PlayerForTeamPresentationDTO.builder()
                        .id(player.getId())
                        .firstName(player.getFirstName())
                        .lastName(player.getLastName())
                        .position(player.getPlayerStats() != null ? player.getPlayerStats().getPosition() : null)
                        .age(player.getAge())
                        .build())
                .collect(Collectors.toList());
    }
}
