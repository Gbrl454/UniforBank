module gbrl.uniforbank {
    requires javafx.controls;
    requires javafx.fxml;

    opens gbrl.uniforbank to javafx.fxml;
    exports gbrl.uniforbank;
    opens gbrl.uniforbank.controllers to javafx.fxml;
    exports gbrl.uniforbank.controllers;
}