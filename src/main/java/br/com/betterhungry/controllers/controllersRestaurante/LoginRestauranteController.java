package br.com.betterhungry.controllers.controllersRestaurante;

import br.com.betterhungry.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginRestauranteController {

    @FXML
    private Button botaoCadastrar;

    @FXML
    private Button botaoEntrar;

    @FXML
    private PasswordField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML
    void fazerLogin(ActionEvent event) {

    }

    @FXML
    void telaCadastroRestaurante(ActionEvent event) {
        App.trocarTela(3);
    }

}