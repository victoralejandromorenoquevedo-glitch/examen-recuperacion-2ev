package es.fplumara.dam1.restaurantes.model;

public class Bebida extends ElementoCarta{
    private boolean alcoholica;
    private int volumenMl;

    public Bebida(String codigo, String nombre, String restaurante, double precioBase, boolean alcoholica, int volumenMl) {
        super(codigo, nombre, restaurante, precioBase);
        this.alcoholica = alcoholica;
        this.volumenMl = volumenMl;
    }

    public boolean isAlcoholica() {
        return alcoholica;
    }

    public int getVolumenMl() {
        return volumenMl;
    }

    public String getTipo(){
        return null;
    }
}
