package br.edu.infnet.alugueis.modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    private static Logger logger = LoggerFactory.getLogger(JdbcUtil.class);

    public static Connection obterConexao(){
        logger.info("Iniciando conexão com o banco de dados");
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/aula01?createDatabaseIfNotExist=TRUE",
                                        "root",
                                        "");
        } catch (SQLException e) {
            logger.error("Erro ao conectar", e);
            throw new RuntimeException(e);
        }
    }
}
