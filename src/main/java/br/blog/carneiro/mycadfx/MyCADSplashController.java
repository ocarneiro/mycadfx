package br.blog.carneiro.mycadfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyCADSplashController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}