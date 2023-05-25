package gbrl.uniforbank.exception;

public class ExceptionNomeNull extends Exception {
    @Override
    public String getMessage () {
        return "O Nome deve ser preenchido";
    }
}
