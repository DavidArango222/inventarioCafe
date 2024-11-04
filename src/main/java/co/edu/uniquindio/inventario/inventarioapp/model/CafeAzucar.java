package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class CafeAzucar extends CafeDecorador{
    public CafeAzucar(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion() + ", azucar";
    }

    @Override
    public double getCosto() {
        return cafeDecorador.getCosto() + 0.3;
    }
}
