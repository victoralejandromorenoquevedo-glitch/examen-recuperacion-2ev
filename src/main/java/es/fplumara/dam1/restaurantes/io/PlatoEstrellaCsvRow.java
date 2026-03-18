package es.fplumara.dam1.restaurantes.io;

public record PlatoEstrellaCsvRow(
        String restaurante,
        String codigoElemento,
        String nombreElemento,
        String tipoElemento,
        double popularidad,
        int mesasDistintas
) {
}
