package gbrl.uniforbank.exception;

public class ExceptionLoginInvalid extends Exception {
    @Override
    public String getMessage () {
        return "Login invalido\nCPF e/ou Senha não correspondente";
    }
}
