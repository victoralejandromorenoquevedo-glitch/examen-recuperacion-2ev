package es.fplumara.dam1.restaurantes.io;

public record ElementoCartaCsvRow(
        String tipo,
        String codigo,
        String nombre,
        String restaurante,
        double precioBase,
        String tiempoPreparacion,
        String compartible,
        String guarnicion,
        String servidoFrio,
        String alcoholica,
        String volumenMl,
        String alergenos
) {
}
