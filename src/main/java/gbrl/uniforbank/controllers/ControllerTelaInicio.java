package gbrl.uniforbank.controllers;

import gbrl.uniforbank.Cache;
import gbrl.uniforbank.Main;
import gbrl.uniforbank.Regex;
import gbrl.uniforbank.Telas;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ControllerTelaInicio {
    public VBox pags;
    public Text txComprimento, txSaldo, txConta;

//    @FXML
//    protected void initialize () {
//        //        Main.addOnChageScreenListener((newScreen) -> {
//        if (Cache.usuarioLogado != null) {
//            txComprimento.setText("Olá, " + Cache.usuarioLogado.getNome());
//            txSaldo.setText(String.format("R$ %.2f", Cache.usuarioLogado.getSaldo()));
//            txConta.setText("CPF/Conta " + Regex.CPF(Cache.usuarioLogado.getCpf()));
//        }
//        //        }
//    }

    public void btnSaldo () {
    }

    public void btnSair () {
        Main.changeScreen(Telas.LOGIN);
    }
}
