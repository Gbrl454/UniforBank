package gbrl.uniforbank.controllers;

import gbrl.uniforbank.Main;
import javafx.event.ActionEvent;

public class ControllerTelaLogin {
    public void btnLogar (ActionEvent actionEvent) {
        Main.changeScreen("inicio");
    }

    public void btnRegister (ActionEvent actionEvent) {
        Main.changeScreen("cadastro");
    }
}
