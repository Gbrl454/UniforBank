package gbrl.uniforbank.controllers;

import gbrl.uniforbank.Main;
import javafx.event.ActionEvent;

public class ControllerTelaInicio {
    public void btnSaldo (ActionEvent actionEvent) {
    }

    public void btnSair (ActionEvent actionEvent) {
        Main.changeScreen("login");
    }
}
