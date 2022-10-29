package br.edu.infnet.alugueis.modelo.persistencia;

import br.edu.infnet.alugueis.modelo.entidades.Aluguel;
import br.edu.infnet.alugueis.modelo.entidades.Cliente;
import br.edu.infnet.alugueis.modelo.persistencia.enuns.UpdateClienteDAOEnum;

import java.sql.SQLException;
import java.util.List;

public class AluguelDAO extends JdbcDAO<Aluguel> {
    @Override
    public Boolean salvar(Aluguel obj) {
        return null;
    }

    @Override
    public Boolean atualizar(Aluguel obj, UpdateClienteDAOEnum updateClienteDAOEnum) {
        return null;
    }

    @Override
    public Boolean deletar(Aluguel obj) {
        return null;
    }

    @Override
    public Cliente obter(Aluguel obj) {
        return null;
    }

    @Override
    public List<Aluguel> listarTodos() {

        return null;
    }
}
