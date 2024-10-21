package org.example.exercicio12.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TransacaoResponseDTO {
    ContaDTO origem;
    ContaDTO destino;
    Double valor;
}
