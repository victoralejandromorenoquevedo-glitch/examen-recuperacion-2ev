package es.fplumara.dam1.restaurantes.model;

public class PlatoEstrella {
    private String restaurante;
    private String codigoElemento;
    private String nombreElemento;
    private String tipoElemento;
    private double popularidad;
    private int mesasDistintas;

    public PlatoEstrella(String restaurante, String codigoElemento, String nombreElemento, String tipoElemento, double popularidad, int mesasDistintas) {
        this.restaurante = restaurante;
        this.codigoElemento = codigoElemento;
        this.nombreElemento = nombreElemento;
        this.tipoElemento = tipoElemento;
        this.popularidad = popularidad;
        this.mesasDistintas = mesasDistintas;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public String getCodigoElemento() {
        return codigoElemento;
    }

    public String getNombreElemento() {
        return nombreElemento;
    }

    public String getTipoElemento() {
        return tipoElemento;
    }

    public double getPopularidad() {
        return popularidad;
    }

    public int getMesasDistintas() {
        return mesasDistintas;
    }
}
