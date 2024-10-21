package org.example.exercicio12.mapper;

import org.example.exercicio12.Model.Conta;
import org.example.exercicio12.dto.ContaDTO;

public class ContaMapper {

    public ContaDTO toDTO(Conta conta) {
        if (conta == null) {
            return null;
        }
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }

    public Conta toEntity(ContaDTO contaDTO) {
        if (contaDTO == null) {
            return null;
        }
        return new Conta(contaDTO.getCodigo(), contaDTO.getCliente());
    }
}
