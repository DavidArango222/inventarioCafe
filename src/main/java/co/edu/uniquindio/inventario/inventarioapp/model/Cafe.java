package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class Cafe implements ICafe {

    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double getCosto() {
        return 2.0;
    }
}

