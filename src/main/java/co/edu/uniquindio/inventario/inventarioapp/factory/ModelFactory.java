package co.edu.uniquindio.inventario.inventarioapp.factory;

import co.edu.uniquindio.inventario.inventarioapp.model.Cafe;
import co.edu.uniquindio.inventario.inventarioapp.model.Inventario;
import co.edu.uniquindio.inventario.inventarioapp.services.ICafe;
import co.edu.uniquindio.inventario.inventarioapp.utils.DataUtil;

public class ModelFactory {
    public static ModelFactory  modelFactory;
    private Inventario inventario;

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private ModelFactory() {
        inventario = DataUtil.incializarDatos();
    }

    public void modificarAlmendra(int i) {
        inventario.setCantidadAlmendra(i);
    }

    public void modificarAzucar(int i) {
        inventario.setCantidadAzucar(i);
    }

    public void modificarCanela(int i) {
        inventario.setCantidadCanela(i);
    }

    public void modificarChantilly(int i) {
        inventario.setCantidadChantilly(i);
    }

    public void modificarLeche(int i) {
        inventario.setCantidadLeche(i);
    }

    public void modificarNatural(int i) {
        inventario.setCantidadNatural(i);
    }

    public int getCantidadAlmendra() {
      return inventario.getCantidadAlmendra();
    }

    public int getCantidadAzucar() {
        return inventario.getCantidadAzucar();
    }

    public int getCantidadCanela() {
        return inventario.getCantidadCanela();
    }

    public int getCantidadChantilly() {
        return inventario.getCantidadChantilly();
    }

    public int getCantidadLeche() {
        return inventario.getCantidadLeche();
    }

    public int getCantidadNatural() {
        return inventario.getCantidadNatural();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void consumirAlmendra() {
        if (inventario.getCantidadAlmendra() > 0) {
            inventario.setCantidadAlmendra(inventario.getCantidadAlmendra() - 1);
        }
    }

    public void consumirAzucar() {
        if (inventario.getCantidadAzucar() > 0) {
            inventario.setCantidadAzucar(inventario.getCantidadAzucar() - 1);
        }
    }

    public void consumirAzucarNatural() {
        if (inventario.getCantidadNatural() > 0) {
            inventario.setCantidadNatural(inventario.getCantidadNatural() - 1);
        }
    }

    public void consumirChantilly() {
        if (inventario.getCantidadChantilly() > 0) {
            inventario.setCantidadChantilly(inventario.getCantidadChantilly() - 1);
        }
    }

    public void consumirCanela() {
        if (inventario.getCantidadCanela() > 0) {
            inventario.setCantidadCanela(inventario.getCantidadCanela() - 1);
        }
    }

    public void consumirLeche() {
        if (inventario.getCantidadLeche() > 0) {
            inventario.setCantidadLeche(inventario.getCantidadLeche() - 1);
        }
    }
}
