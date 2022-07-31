package br.com.betterhungry.controllers.controllersCliente;

import br.com.betterhungry.App;
import br.com.betterhungry.dao.ClienteDao;
import br.com.betterhungry.dao.Dao;
import br.com.betterhungry.daoImpl.ClienteDaoImpl;
import br.com.betterhungry.modelos.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class CadastrarClienteController {

    @FXML
    private Button botaoCadastrar;

    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField textoCPF;

    @FXML
    private PasswordField textoConfirmacaoDaSenha;

    @FXML
    private TextField textoDataDeNascimento;

    @FXML
    private TextField textoEndereco;

    @FXML
    private TextField textoNome;

    @FXML
    private PasswordField textoSenha;

    @FXML
    private TextField textoUsuario;

    @FXML
    void mudarTelaCadastro(ActionEvent event) {

        String nome = textoNome.getText();
        String usuario = textoUsuario.getText();
        String senha = textoSenha.getText();
        String cpf = textoCPF.getText();
        String endereco = textoEndereco.getText();
        String dataDeNascimento = textoDataDeNascimento.getText();

        Cliente cliente = new Cliente(nome, usuario, senha, cpf, endereco, dataDeNascimento);

        try {
            Connection conexao = new Dao().getConnection();
            ClienteDao clienteDao = new ClienteDaoImpl(conexao);
            clienteDao.salvar(cliente);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        App.trocarTela(2);
    }
    @FXML
    void mudarTelaVoltar(ActionEvent event) {
        App.trocarTela(2);

    }
}

