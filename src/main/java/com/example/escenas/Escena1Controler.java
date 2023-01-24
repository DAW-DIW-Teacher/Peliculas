package com.example.escenas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Escena1Controler {

    @FXML
    void handlerBtn(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Informacion sobre la aplicación");
        alert.showAndWait();
    }

}
