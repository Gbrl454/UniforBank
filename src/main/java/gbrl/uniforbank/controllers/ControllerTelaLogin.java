package gbrl.uniforbank.controllers;

import gbrl.uniforbank.Cache;
import gbrl.uniforbank.Main;
import gbrl.uniforbank.Telas;
import gbrl.uniforbank.database.dao.UsuarioDAO;
import gbrl.uniforbank.database.model.UsuarioDTO;
import gbrl.uniforbank.exception.ExceptionCPFInvalid;
import gbrl.uniforbank.exception.ExceptionCPFNull;
import gbrl.uniforbank.exception.ExceptionLoginInvalid;
import gbrl.uniforbank.exception.ExceptionSenhaNull;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ControllerTelaLogin {
    public Text txMsg;
    public PasswordField tfSenha;
    public TextField tfCPF;

    public void btnLogar () {
        if (tryForm(true)) {
            UsuarioDTO usuario = new UsuarioDTO();
            usuario.setCpf(tfCPF.getText());
            usuario.setSenha(tfSenha.getText());

            try {
                if (UsuarioDAO.tryLogin(usuario)) {
                    Cache.usuarioLogado = UsuarioDAO.getUsuario(usuario);
                    Main.changeScreen(Telas.INICIO);
                } else {
                    throw new ExceptionLoginInvalid();
                }
            } catch (Exception e) {
                setTxMsg(e.getMessage(), true);
                tfSenha.setText("");
            }
        }
    }

    public void btnRegister () {
        Main.changeScreen(Telas.CADASTRO);
    }

    private boolean tryForm (boolean isShow) {
        try {
            if (tfCPF.getText().isEmpty()) {
                throw new ExceptionCPFNull();
            }
            if (tfSenha.getText().isEmpty()) {
                throw new ExceptionSenhaNull();
            }
            if (tfCPF.getText().length() != 11) {
                throw new ExceptionCPFInvalid();
            }
            return true;
        } catch (Exception e) {
            setTxMsg(e.getMessage(), isShow);
        }
        return false;
    }

    private void setTxMsg (String msg, boolean isShow) {
        txMsg.setText(msg);
        txMsg.setVisible(isShow);
    }

    public void offTxMsg () {
        tryForm(false);
    }
}
