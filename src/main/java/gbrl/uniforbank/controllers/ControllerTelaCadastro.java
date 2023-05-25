package gbrl.uniforbank.controllers;

import gbrl.uniforbank.Main;
import gbrl.uniforbank.Telas;
import gbrl.uniforbank.database.dao.UsuarioDAO;
import gbrl.uniforbank.database.model.UsuarioDTO;
import gbrl.uniforbank.exception.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Objects;

public class ControllerTelaCadastro {
    public Text txMsg;
    public TextField tfNome;
    public TextField tfCPF;
    public PasswordField tfSenha;
    public PasswordField tfSenhaConf;

    public void btnVoltar () {
        Main.changeScreen(Telas.LOGIN);
    }

    public void btnCadastrar () {
        if (tryForm()) {
            UsuarioDTO usuario = new UsuarioDTO();
            usuario.setNome(tfNome.getText());
            usuario.setCpf(tfCPF.getText());
            usuario.setSenha(tfSenha.getText());

            if (UsuarioDAO.createUsuario(usuario)) {
                Main.changeScreen(Telas.INICIO);
            }
        } else {
            tfSenha.setText("");
            tfSenhaConf.setText("");
        }
    }

    private boolean tryForm () {
        try {
            if (tfNome.getText().isEmpty()) throw new ExceptionNomeNull();
            if (tfCPF.getText().isEmpty()) throw new ExceptionCPFNull();
            if (tfSenha.getText().isEmpty()) throw new ExceptionSenhaNull();
            if (tfSenhaConf.getText().isEmpty()) throw new ExceptionSenhaNull();
            if (!Objects.equals(tfSenha.getText(), tfSenhaConf.getText())) throw new ExceptionSenhasNotEquals();
            if (tfCPF.getText().length() != 11) throw new ExceptionCPFInvalid();
            return true;
        } catch (Exception e) {
            txMsg.setText(e.getMessage());
            txMsg.setVisible(true);
        }
        return false;
    }

}
