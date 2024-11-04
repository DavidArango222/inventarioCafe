package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;

public abstract class CafeDecorador implements ICafe{
    protected ICafe cafeDecorador;

    public CafeDecorador(ICafe cafe){
        this.cafeDecorador = cafe;
    }

    @Override
    public String getDescripcion() {
        return cafeDecorador.getDescripcion();
    }

    @Override
    public double getCosto() {
        return cafeDecorador.getCosto();
    }
}

