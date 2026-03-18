package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public class Entrante extends PlatoComida implements Alergenico{
    private boolean compartible;
    private Set<Alergeno> alergenos;

    public Entrante(int tiempoPreparacion, boolean compartible, Set<Alergeno> alergenos) {
        super(tiempoPreparacion);
        this.compartible = compartible;
        this.alergenos = alergenos;
    }

    public boolean isCompartible() {
        return compartible;
    }


    @Override
    public Set<Alergeno> getAlegernos() {
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
