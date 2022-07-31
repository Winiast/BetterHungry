package br.com.betterhungry.dao;

import br.com.betterhungry.modelos.Cliente;

import java.util.ArrayList;

public interface ClienteDao {

    public Cliente salvar();

    public void editar();

    public void delete();

    public ArrayList<Cliente> listarTodos();

    public boolean autenticar();

    public Cliente buscar();
}
