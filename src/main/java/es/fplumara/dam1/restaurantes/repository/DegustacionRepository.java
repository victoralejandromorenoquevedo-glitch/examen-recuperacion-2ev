package es.fplumara.dam1.restaurantes.repository;

import es.fplumara.dam1.restaurantes.model.Degustacion;

import java.util.List;
import java.util.Optional;

public interface DegustacionRepository {
    void alta(Degustacion degustacion);
    boolean yaExiste(String id);
    List<Degustacion> obtenerTodas();
    Optional<Degustacion>buscarPorId(String id);
    List<Degustacion>buscarPorMesa(String idMesa);
    List<Degustacion>buscarPorElemento(String codigoElemento);
    boolean existeDegustacionDeMesaParaElementos(String idMesa, String codigoElemento);
}
