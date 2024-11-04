package co.edu.uniquindio.inventario.inventarioapp.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.inventario.inventarioapp.controller.InventarioController;
import co.edu.uniquindio.inventario.inventarioapp.factory.ModelFactory;
import co.edu.uniquindio.inventario.inventarioapp.model.Inventario;
import co.edu.uniquindio.inventario.inventarioapp.services.IObservador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InventarioViewController implements IObservador {
    InventarioController inventarioController;
    Inventario inventario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAlmendra;

    @FXML
    private Button btnAzucar;

    @FXML
    private Button btnCanela;

    @FXML
    private Button btnChantilly;

    @FXML
    private Button btnLeche;

    @FXML
    private Button btnNatural;

    @FXML
    private Label txtAlmendra;

    @FXML
    private Label txtAzucar;

    @FXML
    private Label txtCanela;

    @FXML
    private Label txtChantilly;

    @FXML
    private TextField txtIngresarAlmendra;

    @FXML
    private TextField txtIngresarAzucar;

    @FXML
    private TextField txtIngresarCanela;

    @FXML
    private TextField txtIngresarChantilly;

    @FXML
    private TextField txtIngresarLeche;

    @FXML
    private TextField txtIngresarNatural;

    @FXML
    private Label txtLeche;

    @FXML
    private Label txtNatural;

    @FXML
    void modificarAlmendra(ActionEvent event) {
        inventarioController.modificarAlmendra(Integer.parseInt(txtIngresarAlmendra.getText()));
        txtAlmendra.setText(String.valueOf(inventarioController.getCantidadAlmendra()));
    }

    @FXML
    void modificarAzucar(ActionEvent event) {
        inventarioController.modificarAzucar(Integer.parseInt(txtIngresarAzucar.getText()));
        txtAzucar.setText(String.valueOf(inventarioController.getCantidadAzucar()));
    }

    @FXML
    void modificarCanela(ActionEvent event) {
        inventarioController.modificarCanela(Integer.parseInt(txtIngresarCanela.getText()));
        txtCanela.setText(String.valueOf(inventarioController.getCantidadCanela()));
    }

    @FXML
    void modificarChantilly(ActionEvent event) {
        inventarioController.modificarChantilly(Integer.parseInt(txtIngresarChantilly.getText()));
        txtChantilly.setText(String.valueOf(inventarioController.getCantidadChantilly()));
    }

    @FXML
    void modificarLeche(ActionEvent event) {
        inventarioController.modificarLeche(Integer.parseInt(txtIngresarLeche.getText()));
        txtLeche.setText(String.valueOf(inventarioController.getCantidadLeche()));
    }

    @FXML
    void modificarNatural(ActionEvent event) {
        inventarioController.modificarNatural(Integer.parseInt(txtIngresarNatural.getText()));
        txtNatural.setText(String.valueOf(inventarioController.getCantidadNatural()));
    }

    @FXML
    void initialize() {
        inventarioController = new InventarioController();
        inventario = ModelFactory.getInstance().getInventario();
        inventario.agregarObservador(this);
        actualizar();
        initView();
    }

    private void initView() {
        initDataBindingInventario();
    }

    private void initDataBindingInventario() {
        txtAlmendra.setText(String.valueOf(inventarioController.getCantidadAlmendra()));
        txtAzucar.setText(String.valueOf(inventarioController.getCantidadAzucar()));
        txtCanela.setText(String.valueOf(inventarioController.getCantidadCanela()));
        txtChantilly.setText(String.valueOf(inventarioController.getCantidadChantilly()));
        txtLeche.setText(String.valueOf(inventarioController.getCantidadLeche()));
        txtNatural.setText(String.valueOf(inventarioController.getCantidadNatural()));
    }

    @Override
    public void actualizar() {
        initDataBindingInventario();
    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
