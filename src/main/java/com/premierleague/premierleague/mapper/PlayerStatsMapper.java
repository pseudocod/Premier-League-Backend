package com.premierleague.premierleague.mapper;

import com.premierleague.premierleague.domain.dto.playerstats.PlayerStatsByPlayerIdDTO;
import com.premierleague.premierleague.domain.entity.player.PlayerStats;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerStatsMapper {
    PlayerStatsMapper INSTANCE = Mappers.getMapper(PlayerStatsMapper.class);

    PlayerStatsByPlayerIdDTO toPlayerStatsByPlayerIdDTO(PlayerStats playerStats);
}
