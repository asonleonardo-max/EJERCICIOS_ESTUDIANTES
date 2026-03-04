/*Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.*/

public class Ejercicios2 {
    public static void main(String[] args) {
        
        int[] cedulas = {1001, 2005, 3050, 4020, 5500, 6780, 7890};
        int cedulaBuscada = 4020;

        int inicio = 0;
        int fin = cedulas.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                System.out.println("Cliente encontrado en la posición: " + medio);
                encontrado = true;
                break;
            } else if (cedulas[medio] < cedulaBuscada) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }

    }
    
}
