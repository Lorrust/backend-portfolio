package org.example.exercicio13.service.impl;

import org.example.exercicio13.dto.PlayerDto;
import org.example.exercicio13.entity.PlayerEntity;
import org.example.exercicio13.mapper.PlayerMapper;
import org.example.exercicio13.repository.PlayerRepository;
import org.example.exercicio13.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public PlayerDto createPlayer(PlayerDto playerDto) {
        PlayerEntity player = playerMapper.toEntity(playerDto);
        player = playerRepository.save(player);
        return playerMapper.toDto(player);
    }

    @Override
    public List<PlayerDto> getAllPlayers() {
        return playerRepository.findAll()
                .stream()
                .map(playerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepository.deleteById(id);
    }
}
