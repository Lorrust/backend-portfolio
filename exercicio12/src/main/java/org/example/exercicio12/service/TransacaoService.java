package org.example.exercicio12.service;

import org.example.exercicio12.dto.TransacaoRequestDTO;
import org.example.exercicio12.dto.TransacaoResponseDTO;

public interface TransacaoService {

    TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO transacao);

}
