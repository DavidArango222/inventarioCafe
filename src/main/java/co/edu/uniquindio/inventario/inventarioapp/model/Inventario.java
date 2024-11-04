package co.edu.uniquindio.inventario.inventarioapp.model;

import co.edu.uniquindio.inventario.inventarioapp.services.IObservable;
import co.edu.uniquindio.inventario.inventarioapp.services.IObservador;

import java.util.ArrayList;
import java.util.List;

public class Inventario implements IObservable {
    private List<IObservador> observadorList = new ArrayList<>();
    protected int cantidadLeche;
    protected int cantidadAlmendra;
    protected int cantidadAzucar;
    protected int cantidadNatural;
    protected int cantidadChantilly;
    protected int cantidadCanela;

    public Inventario(int cantidadLeche,
                      int cantidadAzucar,
                      int cantidadCanela,
                      int cantidadNatural,
                      int cantidadAlmendra,
                      int cantidadChantilly) {
        this.cantidadLeche = cantidadLeche;
        this.cantidadAzucar = cantidadAzucar;
        this.cantidadCanela = cantidadCanela;
        this.cantidadNatural = cantidadNatural;
        this.cantidadAlmendra = cantidadAlmendra;
        this.cantidadChantilly = cantidadChantilly;

    }

    public Inventario() {}

    public int getCantidadLeche() {
        return cantidadLeche;
    }

    public void setCantidadLeche(int cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
        notificarObservadores();
    }

    public int getCantidadAlmendra() {
        return cantidadAlmendra;
    }

    public void setCantidadAlmendra(int cantidadAlmendra) {
        this.cantidadAlmendra = cantidadAlmendra;
        notificarObservadores();
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
        notificarObservadores();
    }

    public int getCantidadNatural() {
        return cantidadNatural;
    }

    public void setCantidadNatural(int cantidadNatural) {
        this.cantidadNatural = cantidadNatural;
        notificarObservadores();
    }

    public int getCantidadChantilly() {
        return cantidadChantilly;
    }

    public void setCantidadChantilly(int cantidadChantilly) {
        this.cantidadChantilly = cantidadChantilly;
        notificarObservadores();
    }

    public int getCantidadCanela() {
        return cantidadCanela;
    }

    public void setCantidadCanela(int cantidadCanela) {
        this.cantidadCanela = cantidadCanela;
        notificarObservadores();
    }

    @Override
    public void agregarObservador(IObservador observador) {
        observadorList.add(observador);
    }

    @Override
    public void eliminarObservador(IObservador observador) {
        observadorList.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (IObservador observador : observadorList) {
            observador.actualizar();
        }
    }
}
