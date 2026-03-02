/*El Cajero del Supermercado (Inventario)
Un cajero escanea un producto con el código de barras 770123. El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico. */

public class Ejercicios1 {
    public static void main(String[] args) {
    
        int [] codigo = {770275, 782454, 770236, 770123, 770124};

        /*int numero = 770123;

        if numero == numero;*/



        for (int i = 0; i < codigo.length; i++) {
            System.out.println("codigo[" + i + "] = " + codigo[i]);
        }
        
        for (int n : codigo) {
            System.out.print(n + " ");
        }
    }
}
