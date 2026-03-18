# **Rúbrica — PROGRAMACIÓN (10,00 puntos)**

## **P1. Modelo OO según diagrama (2,0)**

- **2,0**: ElementoCarta abstracta con getTipo() abstracto; PlatoComida abstracta; jerarquía correcta (Entrante y Principal desde PlatoComida, Postre y Bebida desde ElementoCarta); Alergenico solo en Entrante, Principal y Postre; Alergeno bien usado; atributos y getters correctos; PlatoEstrella y Degustacion correctos.
- **1,25**: casi completo con 1 fallo menor de jerarquía, interfaz, enum o getters.
- **0,50**: estructura parcial o confusa; faltan varias clases o relaciones importantes.
- **0,00**: no implementado / no compila.

## **P2. Dominio: alérgenos + puntuación base (1,00)**

- **1,00**: contieneAlergeno() correcto en Entrante, Principal y Postre; Bebida no implementa Alergenico; getPuntuacionBase() correcto (unidades * valoracion) con double.
- **0,5**: casi correcto con detalle menor.
- **0,25**: incompleto o parcialmente correcto.
- **0,00**: no implementado.

## **P3. Repositorios en memoria con Map (1,50)**

- **1,50**: interfaces + impls correctas; Map real; buscarPorCodigo / buscarPorId con Optional; obtenerTodos() / obtenerTodas() correctos; buscarPorRestaurante, buscarPorMesa, buscarPorElemento y existeDegustacionDeMesaParaElemento correctos.
- **1,00**: funciona pero hay 1 fallo menor (p. ej. un método auxiliar incompleto o una devolución poco limpia).
- **0,50**: incompleto pero usable (faltan partes o hay errores de diseño, pero se puede trabajar).
- **0,00**: no usable / no implementado.

## **P4. Service: validaciones + reglas + excepciones (1,50)**

*Se considera validación completa si cubre: null/vacíos, rangos de unidades y valoracion, precioBase, validaciones por subtipo, duplicado por id/código, existencia de elemento y regla “1 degustación por mesa y elemento”, usando las excepciones correctas.*

- **1,50**: validaciones completas + excepciones correctas + regla “1 degustación por mesa y elemento”; lógica en service (no en repos).
- **1,00**: casi todo bien, falta 1 validación/regla menor o un caso de excepción.
- **0,50**: service parcial (reglas principales incompletas o validaciones clave ausentes).
- **0,00**: no implementado / no usable.

## **P5. Recomendaciones (plato estrella) + ordenación (1,00)**

- **1,00**: recomendaciones() correcto; calcula popularidad como suma de puntuacionBase; cuenta mesas distintas; elige un único elemento por restaurante con los desempates correctos (popularidad, mesas, precio, nombre); orden final por restaurante; excluye elementos sin degustaciones.
- **0,75**: casi correcto con 1 fallo.
- **0,00**: no implementado.

## **P6. Consultas: restaurantes() y productosConAlergenoDeRestaurante() (1,00)**

- **1,00**: restaurantes() devuelve Set sin repetidos correctamente y productosConAlergenoDeRestaurante() filtra bien por restaurante y alérgeno, excluyendo Bebida.
- **0,50**: una de las dos consultas está bien y la otra tiene fallos menores.
- **0,00**: no están o no funcionan.

## **P7. Main: integración y transformación DTO↔dominio (2,00)**

*Se considera completo si: da de alta datos desde DTOs, invoca restaurantes() y recomendaciones(), transforma PlatoEstrella a PlatoEstrellaCsvRow y genera la salida.*

**Qué se evalúa en Main:**

- Crear repos + service
- Leer DTOs *CsvRow
- Transformar DTO → dominio (Entrante / Principal / Postre / Bebida y Degustacion)
- Dar de alta / anotar en service
- Llamar a restaurantes() y recomendaciones()
- Transformar PlatoEstrella → PlatoEstrellaCsvRow y escribir

**Niveles:**

- **2,00**: flujo completo funciona y genera salida coherente; muestra por consola y escribe recomendaciones.csv.
- **1,50**: casi completo (falla escritura o impresión, pero recomendaciones() se calcula bien).
- **1,00**: registra datos pero no llega a recomendaciones o no transforma bien.
- **0,50**: Main muy incompleto (solo crea objetos / flujo roto).
- **0,00**: no hay integración.

---

## **Penalizaciones Programación**

- **2,0** si no compila (no se puede evaluar).
- **0,5** si no respeta paquetes/capas del enunciado.