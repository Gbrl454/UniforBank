package gbrl.uniforbank.exception;

public class ExceptionSenhaNull extends Exception {
    @Override
    public String getMessage () {
        return "As senhas devem ser preenchidas";
    }
}
