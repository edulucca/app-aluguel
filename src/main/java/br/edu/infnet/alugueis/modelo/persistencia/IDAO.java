package br.edu.infnet.alugueis.modelo.persistencia;

import br.edu.infnet.alugueis.modelo.entidades.Cliente;
import br.edu.infnet.alugueis.modelo.persistencia.enuns.UpdateClienteDAOEnum;

import java.util.List;

public interface IDAO <T>{
    Boolean salvar(T obj);

    Boolean atualizar(T obj, UpdateClienteDAOEnum updateClienteDAOEnum);

    Boolean deletar(T obj);

    Cliente obter(T obj);

    List<T> listarTodos();
}
