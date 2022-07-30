package br.com.betterhungry.controllers.controllersCliente;

import br.com.betterhungry.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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
        App.trocarTela(2);
    }
    @FXML
    void mudarTelaVoltar(ActionEvent event) {
        App.trocarTela(2);

    }
}

