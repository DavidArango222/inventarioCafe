package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class CafeLeche extends CafeDecorador{
    public CafeLeche(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion() + ", leche";
    }

    @Override
    public double getCosto() {
        return cafeDecorador.getCosto() + 0.5;
    }
}

