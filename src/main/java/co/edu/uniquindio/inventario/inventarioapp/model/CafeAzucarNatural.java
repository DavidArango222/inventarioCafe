package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public class CafeAzucarNatural extends CafeDecorador {
    public CafeAzucarNatural(ICafe cafe) {
        super(cafe);
    }
    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion() + ", azúcar natural";
    }
    @Override
    public double getCosto() {
        return cafeDecorador.getCosto() + 0.5;
    }
}
