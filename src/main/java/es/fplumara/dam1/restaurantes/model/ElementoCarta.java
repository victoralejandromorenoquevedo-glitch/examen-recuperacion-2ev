package es.fplumara.dam1.restaurantes.model;

public abstract class ElementoCarta {
    protected String codigo;
    protected String nombre;
    protected String restaurante;
    protected double precioBase;

    public ElementoCarta(String codigo, String nombre, String restaurante, double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.precioBase = precioBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getTipo(){
        return null;
    }
}
