package br.com.betterhungry.controllers;

import br.com.betterhungry.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TelaInicialController {

    @FXML
    private Button botaoCliente;

    @FXML
    private Button botaoRestaurante;

    @FXML
    void mudarTelaLoginRestaurante(ActionEvent event) {
        App.trocarTela(1);
    }

    @FXML
    void mudarTelaLoginCliente(ActionEvent event) {
        App.trocarTela(2);
    }
}