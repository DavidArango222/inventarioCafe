package co.edu.uniquindio.inventario.inventarioapp.services;

public interface IObservable {
    void agregarObservador(IObservador observador);
    void eliminarObservador(IObservador observador);
    void notificarObservadores();
}
