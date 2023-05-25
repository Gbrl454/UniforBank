package gbrl.uniforbank;

public interface Regex {
    static String CPF (String txt) {
        return txt.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
}
