public class Ejercicio7 {

    /*Ejercicio 7 — Inventario compartido
Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.

Crea el arreglo stockAlmacen con valores iniciales.
Asigna stockReportes = stockAlmacen.
Simula una venta reduciendo el stock de un producto desde stockReportes.
Muestra que stockAlmacen también cambió y explica en comentarios por qué.*/

    public static void main(String[] args) {

        int[] stockAlmacen = {50, 40, 30, 20, 10};
        int[] stockReportes = stockAlmacen;

        // Simular venta
        stockReportes[2] -= 5;

        System.out.println("Stock desde almacen:");
        for (int s : stockAlmacen) {
            System.out.print(s + " ");
        }

        // Explicación:
        // Ambos arreglos apuntan a la MISMA dirección de memoria.
        // No se copia el arreglo, solo la referencia.
        // Por eso el cambio se refleja en ambos.
    }
}
