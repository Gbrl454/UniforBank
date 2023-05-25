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

    public static void changeScreen (Telas scene) {
        switch (scene) {
            case LOGIN -> stage.setScene(telaLogin);
            case CADASTRO -> stage.setScene(telaCadastro);
            case INICIO -> stage.setScene(telaInicio);

        }
    }

    @Override
    public void start (Stage stageS) throws IOException {
        stage = stageS;
        int value = 75;

        //        stageS.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/gbrl/uniforbank/imagens/LogoUnifor.png"))));
        //        stageS.resizableProperty().setValue(Boolean.FALSE);

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