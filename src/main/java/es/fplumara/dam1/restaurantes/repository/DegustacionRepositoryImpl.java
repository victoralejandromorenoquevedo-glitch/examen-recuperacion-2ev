package es.fplumara.dam1.restaurantes.repository;

import es.fplumara.dam1.restaurantes.model.Degustacion;
import es.fplumara.dam1.restaurantes.model.ElementoCarta;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DegustacionRepositoryImpl implements DegustacionRepository{
    Map<String, Degustacion> datos;

    public DegustacionRepositoryImpl(Map<String, Degustacion> datos) {
        this.datos = datos;
    }


    @Override
    public void alta(Degustacion degustacion) {
        datos.put(degustacion.getId(), degustacion);
    }

    @Override
    public boolean yaExiste(String id) {
        if(datos.containsKey(id)){
            return true;
        }

        return false;
    }

    @Override
    public List<Degustacion> obtenerTodas() {
        return new ArrayList<>(datos.values());
    }

    @Override
    public Optional<Degustacion> buscarPorId(String id) {
        if(datos.containsKey(id)) {
            return Optional.of(datos.get(id));
        }
        return Optional.empty();
    }

    @Override
    public List<Degustacion> buscarPorMesa(String idMesa) {
        List<Degustacion> buscarPorMesa = new ArrayList<>();
        for (Degustacion m : datos.values()){
            if (m.getIdMesa().equals(idMesa)){
                buscarPorMesa.add(m);
            }
        }
        return buscarPorMesa;
    }

    @Override
    public List<Degustacion> buscarPorElemento(String codigoElemento) {
        List<Degustacion> buscarPorElemento = new ArrayList<>();
        for (Degustacion e : datos.values()){
            if (e.getCodigoElemento().equals(codigoElemento)){
                buscarPorElemento.add(e);
            }
        }
        return buscarPorElemento;
    }

    @Override
    public boolean existeDegustacionDeMesaParaElementos(String idMesa, String codigoElemento) {
        for (Degustacion e : datos.values()){
            if (e.getIdMesa().equals(idMesa) && e.getCodigoElemento().equals(codigoElemento)){
                return true;
            }
        }
        return false;
    }
}
