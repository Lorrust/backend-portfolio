package org.example.exercicio12.controller;

import org.example.exercicio12.dto.TransacaoRequestDTO;
import org.example.exercicio12.dto.TransacaoResponseDTO;
import org.example.exercicio12.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @PostMapping("/transacao")
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO transacao) {
        return transacaoService.gerarTransacao(transacao);
    }

}
