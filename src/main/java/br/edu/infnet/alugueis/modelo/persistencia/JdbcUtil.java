package br.edu.infnet.alugueis.modelo.persistencia;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    public static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/aula01?createDatabaseIfNotExist=TRUE",
                                    "root",
                                    "");
    }
}
