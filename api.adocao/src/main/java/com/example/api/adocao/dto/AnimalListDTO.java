package com.example.api.adocao.dto;

public record AnimalListDTO(Long id, String nome, Long idadeAno, Long idadeMes, String corPelo, String porteTamanho,
                            String pelagem, String castrado, String disponibilidade, String sexo) {
}
