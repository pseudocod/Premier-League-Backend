package com.premierleague.premierleague.mapper;

import com.premierleague.premierleague.domain.dto.player.PlayerCreateDTO;
import com.premierleague.premierleague.domain.dto.player.PlayerDetailsDTO;
import com.premierleague.premierleague.domain.dto.player.PlayerForTeamPresentationDTO;
import com.premierleague.premierleague.domain.dto.playerstats.PlayerStatsForPlayerDetailsDTO;
import com.premierleague.premierleague.domain.dto.team.TeamSummaryForPlayerDTO;
import com.premierleague.premierleague.domain.entity.player.Player;
import com.premierleague.premierleague.domain.entity.player.PlayerStats;
import com.premierleague.premierleague.domain.entity.team.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerMapper {
    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "team", ignore = true)
    Player toPlayer(PlayerCreateDTO playerCreateDTO);

    @Mapping(source = "playerStats", target = "playerStats", qualifiedByName = "mapPlayerStatsToDTO")
    @Mapping(source = "team", target = "team", qualifiedByName = "toTeamSummaryForPlayerDTO")
    PlayerDetailsDTO toPlayerDetailsDTO(Player player);

    PlayerForTeamPresentationDTO toPlayerForTeamPresentationDTO(Player player);

    default PlayerStatsForPlayerDetailsDTO mapPlayerStatsToDTO(PlayerStats playerStats) {
        if (playerStats == null) {
            return null; // Handle null playerStats
        }
        return PlayerStatsForPlayerDetailsDTO.builder()
                .id(playerStats.getId())
                .goalsScored(playerStats.getGoalsScored())
                .assists(playerStats.getAssists())
                .matchesPlayed(playerStats.getMatchesPlayed())
                .yellowCards(playerStats.getYellowCards())
                .redCards(playerStats.getRedCards())
                .minutesPlayed(playerStats.getMinutesPlayed())
                .build();
    }

    default TeamSummaryForPlayerDTO toTeamSummaryForPlayerDTO(Team team) {
        if (team == null) {
            return null; // Handle null team
        }
        return TeamSummaryForPlayerDTO.builder()
                .id(team.getId())
                .name(team.getName())
                .websiteUrl(team.getWebsiteUrl())
                .foundedYear(team.getFoundedYear())
                .logoUrl(team.getLogoUrl())
                .build();
    }

}
