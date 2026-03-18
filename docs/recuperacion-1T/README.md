## **Ejercicio — “Estadísticas de textos con validación (String[])”**

**Objetivo:** Scanner + validación de entrada + String[] + calcular **texto más largo, texto más corto y media de longitud**.

Crea una clase Recuperacion.java en el paquete es.fplumara.dam1.recuperacion.

### **Requisitos**

1. Pide al usuario el tamaño **N** del array.
    - Debe ser **un número entero** y cumplir: **1 ≤ N ≤ 9** (mayor que 0 y menor que 10).
    - Si no introduce un entero válido o está fuera de rango, **vuelve a pedir N**.
2. Crea un array:
    - String[] textos = new String[N];
3. Rellena el array:
    - Para cada posición, pide una cadena de texto.
    - **No se admiten cadenas vacías ni cadenas con solo espacios**.
    - Si el usuario introduce una cadena vacía o solo espacios, vuelve a pedir **esa misma posición**.
4. Una vez relleno, muestra:
    - El **texto más largo**
    - El **texto más corto**
    - La **media de longitud** de todas las cadenas (double)
    - El **array completo** en una línea
    - El número total de **textos cuya longitud es mayor que la media**

> Nota:
>
- La comparación de “mayor” y “menor” se refiere a la **longitud** de las cadenas.
- Si hay empate, puedes quedarte con el primero que aparezca.

---

## **Rúbrica — “Estadísticas de textos con validación (String[])” (10 puntos)**

### **1) Validación del tamaño N (entero y 1 ≤ N ≤ 9) — 2,0 pts**

- **2,0**: Repite hasta que sea **entero válido** y en rango; si entra texto u otro tipo, no rompe y vuelve a pedir.
- **1,0**: Valida rango pero falla con no-números (o al revés).
- **0,5**: Validación incompleta (p. ej. solo >0).
- **0,0**: No valida N.

---

### **2) Creación del array String[] textos = new String[N] — 1,0 pt**

- **1,0**: Array creado con el tamaño introducido.
- **0,5**: Lo crea pero con error menor.
- **0,0**: No crea el array o tamaño incorrecto.

---

### **3) Relleno del array con cadenas válidas — 3,0 pts**

- **3,0**: Pide N textos; si el usuario mete cadena vacía o solo espacios, **repite la misma posición**.
- **2,0**: Valida, pero en algún caso avanza de posición cuando no debe o no controla bien los espacios.
- **1,0**: Rellena sin validación robusta.
- **0,0**: No rellena correctamente.

---

### **4) Cálculo del texto más largo y más corto — 1,5 pts**

- **1,5**: Detecta correctamente el texto más largo y el más corto comparando longitudes; inicialización robusta (por ejemplo con textos[0]).
- **1,0**: Uno correcto y otro con fallo, o inicialización poco robusta.
- **0,0**: Incorrecto o no lo calcula.

---

### **5) Cálculo de suma de longitudes y media (double) — 1,5 pts**

- **1,5**: Suma correctamente las longitudes y calcula la media en double.
- **0,5**: Suma bien pero media con error.
- **0,0**: Incorrecto.

---

### **6) Mostrar el array completo en una línea — 0,5 pts**

- **0,5**: Muestra todos los elementos del array en orden y de forma legible.
- **0,0**: No lo muestra o está incompleto.

---

### **7) Contar cuántos textos tienen longitud mayor que la media — 1,5 pts**

- **1,5**: Cuenta correctamente los textos cuya longitud es **estrictamente mayor** que la media.
- **1,0**: Cuenta pero con criterio ligeramente incorrecto (>= en vez de > o similar).
- **0,5**: Intenta pero el contador está mal planteado.
- **0,0**: No lo hace.

---

### **8) Salida final clara y completa — 0,5 pts**

- **0,5**: Muestra **texto más largo, texto más corto, media, array y contador** con etiquetas claras.
- **0,0**: Salida confusa o falta algún dato.

---

## **Penalizaciones (sobre el total)**

- **–0,5**: No controla bien el salto de línea de Scanner y provoca que se lean cadenas vacías sin querer.
- **–0,25**: Falta de orden o claridad en los mensajes, aunque los cálculos estén bien.