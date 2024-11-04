package co.edu.uniquindio.inventario.inventarioapp.controller;

import co.edu.uniquindio.inventario.inventarioapp.factory.ModelFactory;
import co.edu.uniquindio.inventario.inventarioapp.model.Inventario;
import javafx.scene.control.TextField;

public class InventarioController {
    ModelFactory modelFactory;

    public InventarioController() {
        modelFactory = ModelFactory.getInstance();
    }

    public void modificarAlmendra(int i) {
        modelFactory.modificarAlmendra(i);
    }

    public void modificarAzucar(int i) {
        modelFactory.modificarAzucar(i);
    }

    public void modificarCanela(int i) {
        modelFactory.modificarCanela(i);
    }

    public void modificarChantilly(int i) {
        modelFactory.modificarChantilly(i);
    }

    public void modificarLeche(int i) {
        modelFactory.modificarLeche(i);
    }

    public void modificarNatural(int i) {
        modelFactory.modificarNatural(i);
    }

    public int getCantidadAlmendra() {
        return modelFactory.getCantidadAlmendra();
    }

    public int getCantidadAzucar() {
        return modelFactory.getCantidadAzucar();
    }

    public int getCantidadCanela() {
        return modelFactory.getCantidadCanela();
    }

    public int getCantidadChantilly() {
        return modelFactory.getCantidadChantilly();
    }

    public int getCantidadLeche() {
        return modelFactory.getCantidadLeche();
    }

    public int getCantidadNatural() {
        return modelFactory.getCantidadNatural();
    }
}
