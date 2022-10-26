package br.edu.infnet.alugueis.modelo.entidades;

public class Cliente {
    private Long codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private boolean whatsapp;

    public Cliente(Long codigo, String nome, String cpf, String telefone, boolean whatsapp) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.whatsapp = whatsapp;
    }

    public Cliente() {

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    public int getTinyintWhatsapp(){
        if(this.getWhatsapp()){
            return 1;
        }
        return 0;
    }
}
