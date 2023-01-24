package com.example.escenas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

import java.io.IOException;

public class MainControler {

    //public void handlerBtnEscena1(ActionEvent actionEvent)  throws IOException {
     //   FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Escena1View.fxml"));
    //    Main.mainNode.setCenter(fxmlLoader.load());
    //}

    //public void handleBtnEscena2(ActionEvent actionEvent) throws IOException {
    //    FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Escena2View.fxml"));
    //    Main.mainNode.setCenter(fxmlLoader.load());
    //}

    public void handlerBtnSalir(ActionEvent actionEvent) {
        System.exit(0);

    }
}