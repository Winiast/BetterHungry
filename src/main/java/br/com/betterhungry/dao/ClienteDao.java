package br.com.betterhungry.dao;

import br.com.betterhungry.modelos.Cliente;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ClienteDao {

    public Cliente salvar(Cliente cliente) throws SQLException;


//    public void editar();

//    public void delete();

//    public ArrayList<Cliente> listarTodos();

//    public boolean autenticar();

//    public Cliente buscar();

//    Cliente salvar(Cliente cliente) throws SQLException;
}
