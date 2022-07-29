package br.com.betterhungry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    private static Stage stage;

    private static Scene telaInicialScene;
    private static Scene loginRestauranteScene;
    private static Scene loginClienteScene;
    URL fxmlTelaInicial = getClass().getResource("telaInicial.fxml");
    URL fxmlLoginRestaurante = getClass().getResource("restaurante/loginRestaurante.fxml");
    URL fxmlLoginCliente = getClass().getResource("cliente/loginCliente.fxml");

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;

        Parent telaInicial = new FXMLLoader().load(fxmlTelaInicial);
        telaInicialScene = new Scene(telaInicial);

        Parent loginRestaurante = new FXMLLoader().load(fxmlLoginRestaurante);
        loginRestauranteScene = new Scene(loginRestaurante);

        Parent loginCliente = new FXMLLoader().load(fxmlLoginCliente);
        loginClienteScene = new Scene(loginCliente);

        primaryStage.setTitle("Better Hungry");
        primaryStage.setScene(telaInicialScene);
        primaryStage.show();
    }

    public static void trocarTela(int numTela) {

        switch (numTela) {

            case 0:
                stage.setScene(telaInicialScene);
                break;

            case 1:
                stage.setScene(loginRestauranteScene);
                break;

            case 2:
                stage.setScene(loginClienteScene);
                break;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}