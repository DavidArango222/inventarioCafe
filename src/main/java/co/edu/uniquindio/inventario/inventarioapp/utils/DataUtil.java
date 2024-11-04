package co.edu.uniquindio.inventario.inventarioapp.utils;

import co.edu.uniquindio.inventario.inventarioapp.model.Inventario;

public class DataUtil {
    public static Inventario incializarDatos(){
        return new Inventario(0,
                20,
                5,
                5,
                3,
                10);
    }
}
