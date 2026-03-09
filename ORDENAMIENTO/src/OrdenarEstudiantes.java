/*Registro Alfabético de Estudiantes
Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar sus nombres (cadenas de texto).
Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
Requisito técnico: El estudiante debe investigar y aplicar el método nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.*/

import java.util.Scanner;

public class OrdenarEstudiantes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = teclado.nextInt();
        teclado.nextLine();

        String[] nombres = new String[n];

        // Ingresar nombres
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = teclado.nextLine();
        }

        // Insertion Sort adaptado para texto
        for (int i = 1; i < nombres.length; i++) {

            String clave = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(clave) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }

            nombres[j + 1] = clave;
        }

        // Mostrar lista ordenada
        System.out.println("\nLista de estudiantes en orden alfabético:");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        teclado.close();

        /*  compareToIgnoreCase compara dos textos ignorando
            mayúsculas y minúsculas.
            Si devuelve un valor mayor que 0 significa que el
            primer nombre es alfabéticamente mayor que el segundo.
        */  
    }
}
