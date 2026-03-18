package es.fplumara.dam1.restaurantes.service;

import es.fplumara.dam1.restaurantes.exception.ElementoDuplicadoException;
import es.fplumara.dam1.restaurantes.exception.ElementoNoDisponibleException;
import es.fplumara.dam1.restaurantes.exception.ReglaCartaException;
import es.fplumara.dam1.restaurantes.model.*;
import es.fplumara.dam1.restaurantes.repository.DegustacionRepositoryImpl;
import es.fplumara.dam1.restaurantes.repository.ElementoCartaRepositoryImpl;

import java.util.List;
import java.util.Set;

public class MuestraServiceImpl implements MuestraService{
    private ElementoCartaRepositoryImpl elementoRepo;
    private DegustacionRepositoryImpl degustacionRepo;

    public MuestraServiceImpl(ElementoCartaRepositoryImpl elementoRepo, DegustacionRepositoryImpl degustacionRepo) {
        this.elementoRepo = elementoRepo;
        this.degustacionRepo = degustacionRepo;
    }

    @Override
    public void altaElemento(ElementoCarta elemento) {
        if(elemento == null){
            throw new IllegalArgumentException("ERROR: el elelemento es nulo");
        }
        if(elemento.getCodigo() == null || elemento.getCodigo().isBlank() ||elemento.getNombre() == null || elemento.getNombre().isBlank() || elemento.getRestaurante() == null || elemento.getRestaurante().isBlank()){
            throw new IllegalArgumentException("ERROR: al elemento le faltan datos");
        }
        if(elemento.getPrecioBase() <= 0){
            throw new IllegalArgumentException("ERROR: el precio es un valor negativo");
        }
        if(elementoRepo.yaExiste(elemento.getCodigo())){
            throw new ElementoDuplicadoException("ERROR: el elemento ya ha sido registrado");
        }
        if (elemento instanceof Entrante e){
            if(e.getTiempoPreparacion() < 0 || e.getAlegernos() == null){
                throw new IllegalArgumentException("ERROR: al elemento le faltan datos o son incorrectos");
            }
        }
        if (elemento instanceof Principal p){
            if (p.getTiempoPreparacion() < 0 || p.getGuarnicion() == null) {
                throw new IllegalArgumentException("ERROR: al elemento le faltan datos o son incorrectos");
            }
        }
        if(elemento instanceof Postre p){
            if(p.getAlegernos() == null){
                throw new IllegalArgumentException("ERROR: al elemento le faltan datos");
            }
        }
        if(elemento instanceof Bebida b){
            if(b.getVolumenMl()<0){
                throw new IllegalArgumentException("ERROR: los datos del elementos son incorrectos");
            }
        }
        elementoRepo.alta(elemento);
    }

    @Override
    public void anotarDegustacion(Degustacion degustacion) {
        if(degustacion == null){
            throw new IllegalArgumentException("ERROR: la degustacion esta vacia");
        }
        if (degustacion.getId() == null || degustacion.getId().isBlank() || degustacion.getIdMesa()==null||degustacion.getIdMesa().isBlank()||degustacion.getCodigoElemento()==null||degustacion.getCodigoElemento().isBlank()){
            throw new IllegalArgumentException("ERROR: a la degustacion le faltan datos por rellenar");
        }
        if(degustacion.getUnidades()<1||degustacion.getUnidades()>6){
            throw new IllegalArgumentException("ERROR: los datos de la degustacion son incorrectos");
        }
        if(degustacion.getValoracion()<1.0 ||degustacion.getValoracion()>6){
            throw new IllegalArgumentException("ERROR: los datos de la degustacion son incorrectos");
        }
        if(degustacionRepo.yaExiste(degustacion.getId())){
            throw new ElementoDuplicadoException("ERROR: esta degustacion ya ha sido registrada");
        }
        if(elementoRepo.yaExiste(degustacion.getCodigoElemento())==false ){
            throw new ElementoNoDisponibleException("ERROR: el elemento de esta degustacion no esta registrado");
        }
        if(degustacionRepo.existeDegustacionDeMesaParaElementos(degustacion.getIdMesa(), degustacion.getCodigoElemento())){
            throw new ReglaCartaException("ERROR: una mesa solo puede anotar una degustacion por elemento");
        }
        degustacionRepo.alta(degustacion);
    }

    @Override
    public List<PlatoEstrella> recomendaciones() {
        return List.of();
    }

    @Override
    public Set<String> restaurantes() {
        return Set.of();
    }

    @Override
    public List<ElementoCarta> productosConAlergenosDeRestaurantes(String restaurante, Alergeno alergeno) {
        return List.of();
    }
}
