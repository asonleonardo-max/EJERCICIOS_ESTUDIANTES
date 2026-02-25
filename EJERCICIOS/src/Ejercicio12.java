public class Ejercicio12 {

    /*Ejercicio 12 — Historial de ventas (lineal)
Una tienda online guarda las ventas del día en un arreglo de double:

Almacena 7 ventas de ejemplo.
Calcula e imprime: la venta más alta, la venta más baja y el total del día.*/

    public static void main(String[] args) {

        double[] ventas = {120.5, 300.0, 90.3, 450.8, 210.4, 175.0, 500.0};

        double mayor = ventas[0];
        double menor = ventas[0];
        double total = 0;

        for (double v : ventas) {
            if (v > mayor) mayor = v;
            if (v < menor) menor = v;
            total += v;
        }

        System.out.println("Venta más alta: " + mayor);
        System.out.println("Venta más baja: " + menor);
        System.out.println("Total del día: " + total);
    }
}
