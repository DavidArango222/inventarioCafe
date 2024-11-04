package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class CafeLecheAlmendra extends  CafeDecorador{
    public CafeLecheAlmendra(ICafe cafe) {
        super(cafe);
    }

    @Override
    public double getCosto() {
        return cafeDecorador.getCosto() + 1.0;
    }

    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion() + ", Leche de Almendra";
    }
}