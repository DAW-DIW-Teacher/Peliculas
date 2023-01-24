package com.example.escenas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PeliculaControler {

    @FXML
    private TextArea ArgumentoTexto;

    @FXML
    private TextField añoTexto;

    @FXML
    private Button borrarDirectores;

    @FXML
    private Button borrarPelicula;

    @FXML
    private Button cerrarPelicula;

    @FXML
    private Button crearDirectores;

    @FXML
    private Button crearPelicula;

    @FXML
    private ListView<String> directoresLista;

    @FXML
    private ImageView posterImagen;

    @FXML
    private ChoiceBox<?> tipoSeleccionable;

    @FXML
    private TextField tituloTexto;

    Stage escenario =  new Stage();

    ObservableList<String> directores = FXCollections.observableArrayList();

    @FXML
    void directoresBorrar(ActionEvent event) {

    }

    @FXML
    void directoresCrear(ActionEvent event) {
        Label directorLabel = new Label("Escribe el director:");
        TextField texto = new TextField();
        Button crear = new Button("Crear");
        Button salir = new Button("Salir");

        salir.setOnAction(e -> escenario.close());
        crear.setOnAction(e -> {
            directores.add(texto.getText());
            escenario.close();
        });

        HBox horizontal = new HBox(crear, salir);
        VBox vertical = new VBox(directorLabel, texto, horizontal);
        Scene escena = new Scene(vertical);
        escenario.setScene(escena);
        escenario.setResizable(false);
        escenario.setMinHeight(120);
        escenario.setMinWidth(200);
        escenario.showAndWait();
    }

    @FXML
    void peliculaBorrar(ActionEvent event) {

    }

    @FXML
    void peliculaCerrar(ActionEvent event) {

    }

    @FXML
    void peliculaCrear(ActionEvent event) {

    }

    public void initialize(){
        directoresLista.setItems(directores);
    }
}
