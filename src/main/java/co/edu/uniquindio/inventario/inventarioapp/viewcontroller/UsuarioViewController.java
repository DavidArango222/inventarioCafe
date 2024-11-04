package co.edu.uniquindio.inventario.inventarioapp.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class UsuarioViewController {

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

    }

    @FXML
    void seleccionarAlmendra(ActionEvent event) {
        chkAlmendra.isSelected();
    }

    @FXML
    void seleccionarAzucar(ActionEvent event) {
        chkAzucar.isSelected();
    }

    @FXML
    void seleccionarCanela(ActionEvent event) {
        chkCanela.isSelected();
    }

    @FXML
    void seleccionarChantilly(ActionEvent event) {
        chkChantilly.isSelected();
    }

    @FXML
    void seleccionarLeche(ActionEvent event) {
        chkLeche.isSelected();
    }

    @FXML
    void seleccionarNatural(ActionEvent event) {
        chkNatural.isSelected();
    }

    @FXML
    void initialize() {

    }

}
