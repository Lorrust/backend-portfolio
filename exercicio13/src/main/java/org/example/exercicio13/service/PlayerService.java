package org.example.exercicio13.service;

import org.example.exercicio13.dto.PlayerDto;

import java.util.List;

public interface PlayerService {

    PlayerDto createPlayer(PlayerDto playerDto);

    List<PlayerDto> getAllPlayers();

    void deletePlayer(Long id);

}
