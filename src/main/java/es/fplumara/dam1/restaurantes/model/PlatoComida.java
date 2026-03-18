package es.fplumara.dam1.restaurantes.model;

public abstract class PlatoComida extends ElementoCarta{

    protected int tiempoPreparacion;

    public PlatoComida(String codigo, String nombre, String restaurante, double precioBase, int tiempoPreparacion) {
        super(codigo, nombre, restaurante, precioBase);
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }
}
