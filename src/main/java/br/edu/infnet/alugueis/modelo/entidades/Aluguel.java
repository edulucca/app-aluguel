package br.edu.infnet.alugueis.modelo.entidades;

import java.time.LocalDateTime;
import java.util.List;

public class Aluguel {
    private Long codigo;

    private LocalDateTime dataInicio;

    private Cliente cliente;

    private List<Equipamento> equipamentos;

}
