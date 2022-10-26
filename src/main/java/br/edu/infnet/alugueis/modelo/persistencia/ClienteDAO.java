package br.edu.infnet.alugueis.modelo.persistencia;

import br.edu.infnet.alugueis.modelo.JdbcUtil;
import br.edu.infnet.alugueis.modelo.entidades.Cliente;
import br.edu.infnet.alugueis.modelo.persistencia.enuns.UpdateClienteDAOEnum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection conn;
    private PreparedStatement preparedStatement;

    private Statement statement;

    private ResultSet resultSet;

    private String sql;

    public ClienteDAO() {
        try {
            this.conn = JdbcUtil.obterConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Boolean salvar(Cliente cliente) {

        try {
            preparedStatement = conn.prepareStatement("insert into cliente(nome, cpf, telefone, whatsapp) values (?,?,?,?)");

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.setString(4, String.valueOf(cliente.getTinyintWhatsapp()));

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Cliente> listarTodos() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            resultSet = conn.createStatement().executeQuery("SELECT * FROM cliente");

            while (resultSet.next()) {
                Cliente cliente = new Cliente(resultSet.getLong("cd_cliente"), resultSet.getString("nome"),
                        resultSet.getString("cpf"),
                        resultSet.getString("telefone"), resultSet.getBoolean("whatsapp"));

                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public Boolean updateCliente(Cliente cliente, UpdateClienteDAOEnum updateClienteDAOEnum) {
        try {
            switch (updateClienteDAOEnum) {
                case CPF -> {
                    preparedStatement = conn.prepareStatement("UPDATE cliente SET cpf = ? WHERE cd_cliente = ?");
                    preparedStatement.setString(1, cliente.getCpf());
                }
                case NOME -> {
                    preparedStatement = conn.prepareStatement("UPDATE cliente SET nome = ? WHERE cd_cliente = ?");
                    preparedStatement.setString(1, cliente.getNome());
                }
                case TELEFONE -> {
                    preparedStatement = conn.prepareStatement("UPDATE cliente SET telefone = ? WHERE cd_cliente = ?");
                    preparedStatement.setString(1, cliente.getTelefone());
                }
                case WHATSAPP -> {
                    preparedStatement = conn.prepareStatement("UPDATE cliente SET whatsapp = ? WHERE cd_cliente = ?");
                    preparedStatement.setBoolean(1, cliente.getWhatsapp());
                }
            }

            preparedStatement.setLong(2, cliente.getCodigo());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public Boolean deleteCliente(Cliente cliente) {
        try {
            preparedStatement = conn.prepareStatement("DELETE FROM cliente WHERE cd_cliente = ?");

            preparedStatement.setLong(1, cliente.getCodigo());

            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}