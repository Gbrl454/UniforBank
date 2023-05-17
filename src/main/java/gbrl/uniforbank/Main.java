package gbrl.uniforbank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage stage;
    private static Scene telaLogin, telaCadastro, telaInicio;

    public static void main (String[] args) {
        launch();
    }

    public static void changeScreen (String scene) {
        switch (scene) {
            case "login" -> {
                stage.setScene(telaLogin);
            }
            case "cadastro" -> {
                stage.setScene(telaCadastro);
            }
            case "inicio" -> {
                stage.setScene(telaInicio);
            }
        }
    }

    @Override
    public void start (Stage stageS) throws IOException {
        stage = stageS;
        int value = 75;

        FXMLLoader fxmlLogin = new FXMLLoader(Main.class.getResource("TelaLogin.fxml"));
        telaLogin = new Scene(fxmlLogin.load(), 16 * value, 9 * value);

        FXMLLoader fxmlCadastro = new FXMLLoader(Main.class.getResource("TelaCadastro.fxml"));
        telaCadastro = new Scene(fxmlCadastro.load(), 16 * value, 9 * value);

        FXMLLoader fxmlInicio = new FXMLLoader(Main.class.getResource("TelaInicio.fxml"));
        telaInicio = new Scene(fxmlInicio.load(), 16 * value, 9 * value);

        stageS.setTitle("Unifor - Bank");
        stageS.setScene(telaLogin);
        stageS.show();
    }
}