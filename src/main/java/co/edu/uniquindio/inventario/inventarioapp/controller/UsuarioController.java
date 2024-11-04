package co.edu.uniquindio.inventario.inventarioapp.controller;

import co.edu.uniquindio.inventario.inventarioapp.factory.ModelFactory;

public class UsuarioController {
    ModelFactory modelFactory;

    public UsuarioController() {
        modelFactory = ModelFactory.getInstance();
    }

    public void consumirAlmendra() {
        modelFactory.consumirAlmendra();
    }

    public void consumirAzucar() {
        modelFactory.consumirAzucar();
    }

    public void consumirCanela() {
        modelFactory.consumirCanela();
    }

    public void consumirChantilly() {
        modelFactory.consumirChantilly();
    }

    public void consumirLeche() {
        modelFactory.consumirLeche();
    }

    public void consumirNatural() {
        modelFactory.consumirAzucarNatural();
    }
}
