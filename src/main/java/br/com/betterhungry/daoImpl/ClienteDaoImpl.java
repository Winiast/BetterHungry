package br.com.betterhungry.daoImpl;

import br.com.betterhungry.dao.ClienteDao;
import br.com.betterhungry.dao.Dao;
import br.com.betterhungry.modelos.Cliente;

import java.sql.*;

public class ClienteDaoImpl extends Dao implements ClienteDao {

    private final Connection connection;

    public ClienteDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Cliente salvar(Cliente cliente) throws SQLException {

        String sql = "INSERT INTO cliente (nome,usuario,senha,cpf,endereco,datadenascimento) VALUES (?,?,?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, cliente.getNome());
        statement.setString(2, cliente.getUsuario());
        statement.setString(3, cliente.getSenha());
        statement.setString(4, cliente.getCpf());
        statement.setString(5, cliente.getEndereco());
        statement.setString(6, cliente.getDataDeNascimento());
        statement.execute();

        ResultSet resultSet = statement.getGeneratedKeys();

        if(resultSet.next()) {
            int id = resultSet.getInt("id");
            cliente.setId(id);
        }

        return cliente;
    }
}
