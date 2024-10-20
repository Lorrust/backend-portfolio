package org.example.exercicio11.controller;

import org.example.exercicio11.dto.JogadorRequestDTO;
import org.example.exercicio11.dto.JogadorResponseDTO;
import org.example.exercicio11.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    JogadorService jogadorService;

    @PostMapping("/create")
    @ResponseBody
    public JogadorResponseDTO createJogador(@RequestBody JogadorRequestDTO jogadorRequestDTO) {
        return jogadorService.createJogador(jogadorRequestDTO);
    }

    @GetMapping()
    public List<JogadorResponseDTO> getAllJogador() {
        return jogadorService.findAllJogadores();
    }

}
