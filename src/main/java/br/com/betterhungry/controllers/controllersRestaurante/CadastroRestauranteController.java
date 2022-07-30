package br.com.betterhungry.controllers.controllersRestaurante;

import br.com.betterhungry.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CadastroRestauranteController {

    @FXML
    private Button botaoVoltar;
    @FXML
    private Button botaoCriarConta;

    @FXML
    private TextField campoCep;

    @FXML
    private TextField campoCnpj;

    @FXML
    private PasswordField campoConfirmarSenha;

    @FXML
    private TextField campoNomeDeUsuario;

    @FXML
    private TextField campoNomeDoRestaurante;

    @FXML
    private PasswordField campoSenha;

    @FXML
    public void criarConta(ActionEvent event) {
        App.trocarTela(1);
    }

    @FXML
    public void voltarTela(ActionEvent event) {
        App.trocarTela(1);
    }

}
