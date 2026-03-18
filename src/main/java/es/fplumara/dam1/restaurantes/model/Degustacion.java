package es.fplumara.dam1.restaurantes.model;

public class Degustacion {
    private String id;
    private String idMesa;
    private String codigoElemento;
    private int unidades;
    private double valoracion;

    public Degustacion(String id, String idMesa, String codigoElemento, int unidades, double valoracion) {
        this.id = id;
        this.idMesa = idMesa;
        this.codigoElemento = codigoElemento;
        this.unidades = unidades;
        this.valoracion = valoracion;
    }

    public String getId() {
        return id;
    }

    public String getIdMesa() {
        return idMesa;
    }

    public String getCodigoElemento() {
        return codigoElemento;
    }

    public int getUnidades() {
        return unidades;
    }

    public double getValoracion() {
        return valoracion;
    }

    public double getPuntuacionBase(){
        if (unidades >= 1 || unidades <= 6 && valoracion >= 1.0 && valoracion <= 5.0){
            double puntuacionBase = unidades * valoracion;
            return puntuacionBase;
        }
        return 0.0;
    }
}
