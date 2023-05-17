package gbrl.uniforbank.controllers;

import gbrl.uniforbank.Main;
import javafx.event.ActionEvent;

public class ControllerTelaCadastro {
    public void btnVoltar (ActionEvent actionEvent) {
        Main.changeScreen("login");
    }

    public void btnCadastrar (ActionEvent actionEvent) {
        Main.changeScreen("inicio");
    }
}
