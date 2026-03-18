package es.fplumara.dam1.restaurantes.repository;

import es.fplumara.dam1.restaurantes.model.ElementoCarta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ElementoCartaRepositoryImpl implements ElementoCartaRepository{
    private Map<String, ElementoCarta> datos;

    public ElementoCartaRepositoryImpl(Map<String, ElementoCarta> datos) {
        this.datos = datos;
    }


    @Override
    public void alta(ElementoCarta elemento) {
        datos.put(elemento.getCodigo(), elemento);
    }

    @Override
    public boolean yaExiste(String codigo) {
        if (datos.containsKey(codigo)){
            return true;
        }
        return false;
    }

    @Override
    public List<ElementoCarta> obtenerTodos() {
        return new ArrayList<>(datos.values());
    }

    @Override
    public Optional<ElementoCarta> buscarPorCodigo(String codigo) {
        if (datos.containsKey(codigo)){
            Optional.of(datos.get(codigo));
        }
        return Optional.empty();
    }

    @Override
    public List<ElementoCarta> buscarPorRestaurante(String restaurante) {
        List<ElementoCarta> buscarPorRestaurante = new ArrayList<>();
        for (ElementoCarta e : datos.values()){
            if (e.getRestaurante().equals(restaurante)){
                buscarPorRestaurante.add(e);
            }
        }
        return buscarPorRestaurante;
    }
}
