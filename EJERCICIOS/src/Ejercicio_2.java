public class Ejercicio_2 {
    
    /*Ejercicio 2 — Calculadora de una tienda
Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

Precio unitario de un producto (double)
Cantidad comprada (int)
Descuento aplicado en porcentaje (double)
Total a pagar después del descuento
Declara las variables, realiza el cálculo y muestra el resultado por consola.*/

    public static void main(String[] args) {

        double precioUnitario = 5000;
        int cantidad = 3;
        double descuento = 10; // porcentaje

        double totalSinDescuento = precioUnitario * cantidad;
        double totalConDescuento = totalSinDescuento - (totalSinDescuento * descuento / 100);

        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Total a pagar: $" + totalConDescuento);
    }

}
