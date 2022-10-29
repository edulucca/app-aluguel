package br.edu.infnet.alugueis.modelo.persistencia;

import br.edu.infnet.alugueis.modelo.entidades.Cliente;
import br.edu.infnet.alugueis.modelo.persistencia.enuns.UpdateClienteDAOEnum;
import org.junit.Assert;
import org.junit.Test;

public class ClienteDAOTest {

    @Test
    public void test(){
        ClienteDAO clienteDAO = new ClienteDAO();

        Assert.assertTrue(clienteDAO.salvar(new Cliente(null, "Eduardo de Lucca", "666.666.666-66", "61998607406", true)));

    }

    @Test
    public void testListaClientes(){
        ClienteDAO clienteDAO = new ClienteDAO();

        Assert.assertTrue(clienteDAO.listarTodos().size() > 0);
    }

    @Test
    public void testObterCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = new Cliente(1L, "Eduardo de Lucca", "666.666.666-66", "61998607406", true);
        Assert.assertEquals(clienteDAO.obter(cliente).getCodigo(), cliente.getCodigo());
    }

    @Test
    public void testUpdateCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente(3L, "Fernando de Oliveira", "666.666.666-66", "61998607406", true);

        Assert.assertTrue(clienteDAO.atualizar(cliente, UpdateClienteDAOEnum.NOME));
    }

    @Test
    public void testDeleteCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente(3L, "Fernando de Oliveira", "666.666.666-66", "61998607406", true);

        Assert.assertTrue(clienteDAO.deletar(cliente));
    }
}
