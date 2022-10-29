package br.edu.infnet.alugueis.modelo.entidades;

import java.time.LocalDateTime;
import java.util.List;

public class Aluguel {
    private Long codigo;

    private LocalDateTime dataInicio;

    private Cliente cliente;

    private List<Equipamento> equipamentos;

    public Aluguel() {
    }

    public Aluguel(Long codigo, LocalDateTime dataInicio, Cliente cliente, List<Equipamento> equipamentos) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.cliente = cliente;
        this.equipamentos = equipamentos;
    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }
}
