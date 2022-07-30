package br.com.betterhungry.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

    public Connection getConnection() throws SQLException{

        Connection conexao = DriverManager.getConnection("jdbc:postgres://localhost5432/betterhungry", "postgres", "26122003");

        return conexao;
    }
}
