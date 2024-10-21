package org.example.exercicio12.service.impl;

import org.example.exercicio12.Model.Conta;
import org.example.exercicio12.dto.ContaDTO;
import org.example.exercicio12.dto.TransacaoRequestDTO;
import org.example.exercicio12.dto.TransacaoResponseDTO;
import org.example.exercicio12.mapper.ContaMapper;
import org.example.exercicio12.service.TransacaoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoServiceImpl implements TransacaoService {

    private final List<Conta> contas;
    private final ContaMapper contaMapper = new ContaMapper();

    public TransacaoServiceImpl() {
        contas = new ArrayList<>();
        contas.add(new Conta("500-1", "Fulano"));
        contas.add(new Conta("320-2", "Ciclano"));
    }

    @Override
    public TransacaoResponseDTO gerarTransacao(TransacaoRequestDTO transacao) {
        Conta contaOrigem = contas.stream()
                .filter(c -> c.getCodigo().equals(transacao.getOrigem()))
                .findFirst()
                .orElse(null);

        Conta contaDestino = contas.stream()
                .filter(c -> c.getCodigo().equals(transacao.getDestino()))
                .findFirst()
                .orElse(null);

        ContaDTO origemDTO = contaMapper.toDTO(contaOrigem);
        ContaDTO destinoDTO = contaMapper.toDTO(contaDestino);

        return new TransacaoResponseDTO(origemDTO, destinoDTO, transacao.getValor());
    }

}
