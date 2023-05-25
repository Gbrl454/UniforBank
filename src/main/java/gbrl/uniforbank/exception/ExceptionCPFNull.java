package gbrl.uniforbank.exception;

public class ExceptionCPFNull extends Exception {
    @Override
    public String getMessage () {
        return "O CPF deve ser preenchido";
    }
}
