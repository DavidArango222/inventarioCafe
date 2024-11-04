package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class CafeChantilly extends CafeDecorador{
    public CafeChantilly(ICafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion() + ", Chantilly";
    }

    @Override
    public double getCosto() {
        return cafeDecorador.getCosto() + 0.5;
    }
}
