package es.fplumara.dam1.restaurantes.io;


public record DegustacionCsvRow(
        String id,
        String idMesa,
        String codigoElemento,
        int unidades,
        double valoracion
) {
}
