package es.fplumara.dam1.restaurantes.app;


public class Main {

    public static void main(String[] args) throws Exception {

        // ============================================================
        // 0) RUTAS DE ENTRADA/SALIDA (no hace falta menú)
        // ============================================================
        // - Ajusta las rutas si en tu proyecto están en otra carpeta.
        // - Debes tener:
        //   - elementos.csv
        //   - degustaciones.csv
        //   - recomendaciones.csv


        // ============================================================
        // 1) CREAR REPOSITORIOS (implementaciones concretas con Map)
        // ============================================================
        // - Crea aquí las implementaciones concretas de:
        //   - ElementoCartaRepository
        //   - DegustacionRepository


        // ============================================================
        // 2) CREAR EL SERVICE (pasando repositorios en el constructor)
        // ============================================================
        // - Crea aquí la implementación de MuestraService
        // - Debes pasarle los repositorios creados en el paso anterior


        // ============================================================
        // 3) LEER CSV DE ELEMENTOS DE CARTA (te lo damos hecho en el paquete io)
        // ============================================================
        // - El reader devuelve DTOs/records (ElementoCartaCsvRow).
        // - TU TRABAJO AQUÍ: transformar cada fila a tu MODELO de dominio:
        //   - Si tipo = ENTRANTE -> crear Entrante(...)
        //   - Si tipo = PRINCIPAL -> crear Principal(...)
        //   - Si tipo = POSTRE -> crear Postre(...)
        //   - Si tipo = BEBIDA -> crear Bebida(...)
        // - Pista:
        //   - los alérgenos vienen en un String separado por "|"
        //   - tendrás que convertir ese texto a un Set<Alergeno>
        // - Después, dar de alta cada elemento con:
        //   service.altaElemento(...)


        // ============================================================
        // 4) LEER CSV DE DEGUSTACIONES
        // ============================================================
        // - El reader devuelve DegustacionCsvRow con:
        //   - unidades ya parseadas a int
        //   - valoracion ya parseada a double
        // - TU TRABAJO AQUÍ: transformar cada fila a tu entidad Degustacion
        //   del dominio
        // - Después, anotar cada degustación con:
        //   service.anotarDegustacion(...)


        // ============================================================
        // 5) MOSTRAR RESULTADOS POR CONSOLA
        // ============================================================

        // 5.1) Set con nombres de restaurantes
        // - Llama al método service.restaurantes()
        // - Muestra por consola el conjunto resultante


        // 5.2) Lista de recomendaciones (platos estrella)
        // - Llama al método service.recomendaciones()
        // - Muestra por consola la lista ordenada de PlatoEstrella


        // 5.3) Consulta de productos con un alérgeno de un restaurante
        // - Llama al método:
        //   service.productosConAlergenoDeRestaurante(...)
        // - Puedes probar, por ejemplo, con un restaurante concreto
        //   y un alérgeno como GLUTEN
        // - Muestra por consola los productos obtenidos


        // ============================================================
        // 6) ESCRIBIR recomendaciones.csv
        // ============================================================
        // - TU TRABAJO AQUÍ: transformar tu lista de PlatoEstrella
        //   a PlatoEstrellaCsvRow
        // - Después, usar PlatoEstrellaCsvWriter para escribirlo a disco


    }
}
