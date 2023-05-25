module gbrl.uniforbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens gbrl.uniforbank to javafx.fxml;
    opens gbrl.uniforbank.controllers to javafx.fxml;
    exports gbrl.uniforbank;
    exports gbrl.uniforbank.controllers;
}