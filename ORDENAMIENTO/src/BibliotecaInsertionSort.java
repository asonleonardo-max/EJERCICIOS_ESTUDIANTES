/*Organización de Biblioteca Dinámica
Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante en su posición correcta.
Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero) de cada uno.
Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver cómo los elementos se desplazan para abrir espacio al nuevo valor.*/

import java.util.Scanner;
public class BibliotecaInsertionSort {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros: ");
        int n = teclado.nextInt();

        int[] isbn = new int[n];

        // Ingresar los ISBN
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ISBN del libro " + (i + 1) + ": ");
            isbn[i] = teclado.nextInt();
        }

        System.out.println("\nProceso de ordenamiento:");

        // Insertion Sort
        for (int i = 1; i < isbn.length; i++) {

            int clave = isbn[i];
            int j = i - 1;

            while (j >= 0 && isbn[j] > clave) {
                isbn[j + 1] = isbn[j];
                j--;
            }

            isbn[j + 1] = clave;

            // Mostrar el arreglo en cada paso
            mostrarArreglo(isbn);
        }

        System.out.println("\nArreglo final ordenado:");
        mostrarArreglo(isbn);

        teclado.close();
    }

    public static void mostrarArreglo(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}

