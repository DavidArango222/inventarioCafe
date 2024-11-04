package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class CafeCanela extends CafeDecorador{
    public CafeCanela(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion() + ", Canela";
    }

    @Override
    public double getCosto() {
        return cafeDecorador.getCosto() + 0.4;
    }
}

