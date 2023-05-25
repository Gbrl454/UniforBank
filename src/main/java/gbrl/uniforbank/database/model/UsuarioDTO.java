package gbrl.uniforbank.database.model;

public class UsuarioDTO {
    // Data Transfer Object
    private String nome;
    private String cpf;
    private String senha;
    private double saldo = 0;

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCpf () {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    public String getSenha () {
        return senha;
    }

    public void setSenha (String senha) {
        this.senha = senha;
    }

    public double getSaldo () {
        return saldo;
    }

    public void setSaldo (double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString () {
        return getNome() + "," + getCpf() + "," + getSenha() + "," + getSaldo() + "\n";
    }
}
