package org.example.exercicio13.mapper;

import org.example.exercicio13.dto.PlayerDto;
import org.example.exercicio13.entity.PlayerEntity;

import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerEntity toEntity(PlayerDto dto) {
        PlayerEntity player = new PlayerEntity();
        player.setName(dto.getName());
        player.setAge(dto.getAge());
        player.setPosition(dto.getPosition());
        return player;
    }

    public PlayerDto toDto(PlayerEntity entity) {
        PlayerDto dto = new PlayerDto();
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setPosition(entity.getPosition());
        return dto;
    }
}