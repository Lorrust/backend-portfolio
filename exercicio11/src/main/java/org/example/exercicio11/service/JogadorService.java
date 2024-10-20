package org.example.exercicio11.service;

import org.example.exercicio11.dto.JogadorRequestDTO;
import org.example.exercicio11.dto.JogadorResponseDTO;

import java.util.ArrayList;
import java.util.List;

public interface JogadorService {

    JogadorResponseDTO createJogador(JogadorRequestDTO jogadorRequestDTO);

    List<JogadorResponseDTO> findAllJogadores();

}
