package gbrl.uniforbank.exception;

public class ExceptionCPFInvalid extends Exception {
    @Override
    public String getMessage () {
        return "O CPF deve ser válido";
    }
}
