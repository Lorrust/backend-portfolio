package org.example.exercicio12.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class TransacaoRequestDTO {
    private String origem;
    private String destino;
    private Double valor;
}
