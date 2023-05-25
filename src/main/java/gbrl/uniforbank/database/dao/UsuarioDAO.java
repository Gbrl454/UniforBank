package gbrl.uniforbank.database.dao;

import gbrl.uniforbank.database.model.UsuarioDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private static final String CSVUsers = "src/main/java/gbrl/uniforbank/database/dao/Usuarios.csv";
    private static final List<UsuarioDTO> usuarios = new ArrayList<>();

    public static boolean createUsuario (UsuarioDTO usuario) {
        try {
            FileWriter arq = new FileWriter(CSVUsers, true);
            PrintWriter gravArq = new PrintWriter(arq);

            gravArq.append(usuario.toString());
            gravArq.close();
            loadUsuarios();
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public static boolean tryLogin (UsuarioDTO usuario) {
        String cpf = usuario.getCpf();
        cpf = cpf.replace(".", "").replace("-", "");
        loadUsuarios();
        for (UsuarioDTO u : usuarios) {
            if (u.getCpf().equals(cpf) && u.getSenha().equals(usuario.getSenha())) {
                return true;
            }
        }
        return false;
    }

    public static UsuarioDTO getUsuario (UsuarioDTO usuario) {
        String cpf = usuario.getCpf();
        cpf = cpf.replace(".", "").replace("-", "");
        loadUsuarios();
        for (UsuarioDTO u : usuarios) {
            if (u.getCpf().equals(cpf)) {
                return u;
            }
        }
        return null;
    }

    private static void loadUsuarios () {
        try {
            usuarios.clear();
            FileReader arq = new FileReader(CSVUsers);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha;
            try {
                linha = lerArq.readLine();
                linha = lerArq.readLine();
                while (linha != null) {
                    String[] info = linha.split(",");

                    UsuarioDTO usuarioDTO = new UsuarioDTO();
                    usuarioDTO.setNome(info[0]);
                    usuarioDTO.setCpf(info[1]);
                    usuarioDTO.setSenha(info[2]);
                    usuarioDTO.setSaldo(Double.parseDouble(info[3]));

                    usuarios.add(usuarioDTO);
                    linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
