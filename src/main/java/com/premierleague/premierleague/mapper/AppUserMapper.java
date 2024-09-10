package com.premierleague.premierleague.mapper;

import com.premierleague.premierleague.domain.dto.user.UserDTO;
import com.premierleague.premierleague.domain.entity.appuser.AppUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AppUserMapper {
    AppUserMapper INSTANCE = Mappers.getMapper(AppUserMapper.class);

    @Mapping(source = "favouriteTeam.id", target = "favouriteTeamId")
    UserDTO toUserDTO(AppUser appUser);

    @Mapping(source = "favouriteTeamId", target = "favouriteTeam.id")
    AppUser toAppUser(UserDTO userDTO);
}
