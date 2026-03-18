package es.fplumara.dam1.restaurantes.model;

import java.util.Set;

public interface Alergenico <E extends Alergeno>{
Set<E> getAlegernos();
boolean contieneAlergeno(E alergeno);
}
