package br.edu.infnet.alugueis.modelo.persistencia;

import br.edu.infnet.alugueis.modelo.JdbcUtil;
import br.edu.infnet.alugueis.modelo.entidades.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class JdbcDAO<T> implements IDAO<T> {
    protected Connection conn;

    protected PreparedStatement preparedStatement;

    protected Statement statement;

    protected ResultSet resultSet;

    protected String sql;

    public JdbcDAO() {
        super();
        this.conn = JdbcUtil.obterConexao();
    }
}
