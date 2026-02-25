public class Ejercicio10 {

    /*Ejercicio 10 — Copiando configuración
Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).

Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
Modifica la copia y demuestra que el original no cambia.
Comenta la diferencia con la asignación directa.*/

    public static void main(String[] args) {

        int[] configuracion = {1920, 1080, 60};

        int[] copiaConfiguracion = new int[configuracion.length];

        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i];
        }

        copiaConfiguracion[2] = 120;

        System.out.println("Configuración original:");
        for (int c : configuracion) {
            System.out.print(c + " ");
        }

        System.out.println("\nCopia modificada:");
        for (int c : copiaConfiguracion) {
            System.out.print(c + " ");
        }

        // Aquí sí hay dos arreglos distintos en memoria.
        // La asignación directa solo copia la referencia, no los datos.
    }   
}
