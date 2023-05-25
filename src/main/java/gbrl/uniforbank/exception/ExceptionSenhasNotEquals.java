package gbrl.uniforbank.exception;

public class ExceptionSenhasNotEquals extends Exception {
    @Override
    public String getMessage () {
        return "As senhas devem ser iguais";
    }
}
