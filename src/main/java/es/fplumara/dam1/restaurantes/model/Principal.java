package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public class Principal extends PlatoComida implements Alergenico{

    private String guarnicion;
    private Set<Alergeno> alergenos;

    public Principal(int tiempoPreparacion, String guarnicion, Set<Alergeno> alergenos) {
        super(tiempoPreparacion);
        this.guarnicion = guarnicion;
        this.alergenos = alergenos;
    }

    public String getGuarnicion() {
        return guarnicion;
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
