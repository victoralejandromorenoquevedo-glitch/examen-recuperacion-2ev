package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public class Postre extends ElementoCarta implements Alergenico{
    private boolean servidoFrio;
    private Set<Alergeno> alergenos;

    public Postre(String codigo, String nombre, String restaurante, double precioBase, boolean servidoFrio, Set<Alergeno> alergenos) {
        super(codigo, nombre, restaurante, precioBase);
        this.servidoFrio = servidoFrio;
        this.alergenos = alergenos;
    }

    @Override
    public Set getAlegernos() {
        return Set.of();
    }

    @Override
    public boolean contieneAlergeno(Alergeno alergeno) {
        if (alergenos.contains(alergeno)){
            return true;
        }
        return false;
    }

    public String getTipo(){
        return null;
    }
}
