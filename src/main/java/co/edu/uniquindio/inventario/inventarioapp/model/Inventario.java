package co.edu.uniquindio.inventario.inventarioapp.model;

public class Inventario {
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
    }

    public int getCantidadAlmendra() {
        return cantidadAlmendra;
    }

    public void setCantidadAlmendra(int cantidadAlmendra) {
        this.cantidadAlmendra = cantidadAlmendra;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadNatural() {
        return cantidadNatural;
    }

    public void setCantidadNatural(int cantidadNatural) {
        this.cantidadNatural = cantidadNatural;
    }

    public int getCantidadChantilly() {
        return cantidadChantilly;
    }

    public void setCantidadChantilly(int cantidadChantilly) {
        this.cantidadChantilly = cantidadChantilly;
    }

    public int getCantidadCanela() {
        return cantidadCanela;
    }

    public void setCantidadCanela(int cantidadCanela) {
        this.cantidadCanela = cantidadCanela;
    }
}
