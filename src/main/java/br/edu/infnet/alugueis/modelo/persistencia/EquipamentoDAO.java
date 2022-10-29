package br.edu.infnet.alugueis.modelo.persistencia;

import br.edu.infnet.alugueis.modelo.entidades.Cliente;
import br.edu.infnet.alugueis.modelo.entidades.Equipamento;
import br.edu.infnet.alugueis.modelo.persistencia.enuns.UpdateClienteDAOEnum;

import java.util.List;

public class EquipamentoDAO extends JdbcDAO<Equipamento> {
    @Override
    public Boolean salvar(Equipamento obj) {
        return null;
    }

    @Override
    public Boolean atualizar(Equipamento obj, UpdateClienteDAOEnum updateClienteDAOEnum) {
        return null;
    }

    @Override
    public Boolean deletar(Equipamento obj) {
        return null;
    }

    @Override
    public Cliente obter(Equipamento obj) {
        return null;
    }

    @Override
    public List<Equipamento> listarTodos() {
        return null;
    }
}
