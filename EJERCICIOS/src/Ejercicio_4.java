public class Ejercicio_4 {
  
    
    /*Ejercicio 4 — Placa de un vehículo
El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

Placa (String)
Año de fabricación (int)
Cilindraje en cc (int)
Precio de compra (double)
Inicial del color (char)
Si tiene SOAT vigente (boolean)
Muestra todos los datos en consola.*/

    public static void main(String[] args) {

        String placa = "ABC123";
        int anioFabricacion = 2020;
        int cilindraje = 1600;
        double precioCompra = 45000000;
        char colorInicial = 'R';
        boolean soatVigente = true;

        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + anioFabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: $" + precioCompra);
        System.out.println("Color (inicial): " + colorInicial);
        System.out.println("SOAT vigente: " + soatVigente);
    }
}
