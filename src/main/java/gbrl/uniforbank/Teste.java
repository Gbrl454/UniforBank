package gbrl.uniforbank;

import gbrl.uniforbank.database.dao.UsuarioDAO;
import gbrl.uniforbank.database.model.UsuarioDTO;

public class Teste {
    public static void main (String[] args) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNome("Maikol");
        usuarioDTO.setCpf("12345678912");
        usuarioDTO.setSenha("123");
        usuarioDTO.setSaldo(99999);

        UsuarioDAO.createUsuario(usuarioDTO);
    }
}
