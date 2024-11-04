package co.edu.uniquindio.inventario.inventarioapp.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.inventario.inventarioapp.controller.InventarioController;
import co.edu.uniquindio.inventario.inventarioapp.controller.UsuarioController;
import co.edu.uniquindio.inventario.inventarioapp.factory.ModelFactory;
import co.edu.uniquindio.inventario.inventarioapp.model.*;
import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;
import co.edu.uniquindio.inventario.inventarioapp.services.IObservador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class UsuarioViewController implements IObservador {
    InventarioViewController inventarioViewController;
    ICafe cafe;
    UsuarioController usuarioController;
    Inventario inventario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnComprar;

    @FXML
    private CheckBox chkAlmendra;

    @FXML
    private CheckBox chkAzucar;

    @FXML
    private CheckBox chkCanela;

    @FXML
    private CheckBox chkChantilly;

    @FXML
    private CheckBox chkLeche;

    @FXML
    private CheckBox chkNatural;

    @FXML
    private Label txtAlmendraDisponible;

    @FXML
    private Label txtAzucarDisponible;

    @FXML
    private Label txtCanelaDisponible;

    @FXML
    private Label txtChantillyDisponible;

    @FXML
    private Label txtIngredientes;

    @FXML
    private Label txtLecheDisponible;

    @FXML
    private Label txtNaturalDisponible;

    @FXML
    private Label txtPrecio;

    @FXML
    void comprar(ActionEvent event) {
        if(chkAlmendra.isSelected()){
            usuarioController.consumirAlmendra();
        }
        if(chkAzucar.isSelected()){
            usuarioController.consumirAzucar();
        }
        if(chkCanela.isSelected()){
            usuarioController.consumirCanela();
        }
        if(chkChantilly.isSelected()){
            usuarioController.consumirChantilly();
        }
        if(chkLeche.isSelected()){
            usuarioController.consumirLeche();
        }
        if(chkNatural.isSelected()){
            usuarioController.consumirNatural();
        }
        mostrarMensaje("Compra realizada",
                "Notificación",
                "Disfruta tu pedido.",
                Alert.AlertType.CONFIRMATION);
    }

    @FXML
    void seleccionarAlmendra(ActionEvent event) {
        actualizar();
    }

    @FXML
    void seleccionarAzucar(ActionEvent event) {
        actualizar();
    }

    @FXML
    void seleccionarCanela(ActionEvent event) {
        actualizar();
    }

    @FXML
    void seleccionarChantilly(ActionEvent event) {
        actualizar();
    }

    @FXML
    void seleccionarLeche(ActionEvent event) {
        actualizar();
    }

    @FXML
    void seleccionarNatural(ActionEvent event) {
        actualizar();
    }

    @FXML
    void initialize() {
        cafe = new Cafe();
        usuarioController = new UsuarioController();
        inventario = ModelFactory.getInstance().getInventario();
        inventario.agregarObservador(this);
        actualizar();
    }

    @Override
    public void actualizar() {
        initDataBindingDisponibilidad();
        initDataBindingPedido();
    }

    private void initDataBindingPedido() {
        ICafe cafe = new Cafe();
        if (chkAzucar.isSelected()) {
            cafe = new CafeAzucar(cafe);
        }
        if (chkNatural.isSelected()) {
            cafe = new CafeAzucarNatural(cafe);
        }
        if (chkChantilly.isSelected()) {
            cafe = new CafeChantilly(cafe);
        }
        if (chkCanela.isSelected()) {
            cafe = new CafeCanela(cafe);
        }
        if (chkLeche.isSelected()) {
            cafe = new CafeLeche(cafe);
        }
        if (chkAlmendra.isSelected()) {
            cafe = new CafeLecheAlmendra(cafe);
        }
        txtIngredientes.setText(cafe.getDescripcion());
        txtPrecio.setText(Double.toString(cafe.getCosto()));
    }

    private void initDataBindingDisponibilidad() {
        txtAlmendraDisponible.setText(String.valueOf(inventario.getCantidadAlmendra()));
        txtAzucarDisponible.setText(String.valueOf(inventario.getCantidadAzucar()));
        txtCanelaDisponible.setText(String.valueOf(inventario.getCantidadCanela()));
        txtChantillyDisponible.setText(String.valueOf(inventario.getCantidadChantilly()));
        txtLecheDisponible.setText(String.valueOf(inventario.getCantidadLeche()));
        txtNaturalDisponible.setText(String.valueOf(inventario.getCantidadNatural()));
    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
