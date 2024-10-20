package org.example.exercicio11.service.impl;

import org.example.exercicio11.dto.JogadorRequestDTO;
import org.example.exercicio11.dto.JogadorResponseDTO;
import org.example.exercicio11.service.JogadorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JogadorServiceImpl implements JogadorService {

    Random r = new Random();

    List<JogadorResponseDTO> jogadores = new ArrayList<>();

    @Override
    public JogadorResponseDTO createJogador(JogadorRequestDTO jogadorRequestDTO) {
        System.out.println(jogadorRequestDTO);
        JogadorResponseDTO jogador = new JogadorResponseDTO(jogadorRequestDTO.nome(), jogadorRequestDTO.apelido(), r.nextInt(0, 100));
        jogadores.add(jogador);
        return jogador;
    }

    @Override
    public List<JogadorResponseDTO> findAllJogadores() {
        return jogadores;
    }
}
