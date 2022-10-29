package br.edu.infnet.alugueis.modelo.entidades;

import java.math.BigDecimal;

public class Equipamento {
    private Long codigo;
    private String nome;
    private BigDecimal valorCompra;

    public Equipamento() {
    }

    public Equipamento(Long codigo, String nome, BigDecimal valorCompra) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(BigDecimal valorCompra) {
        this.valorCompra = valorCompra;
    }
}
