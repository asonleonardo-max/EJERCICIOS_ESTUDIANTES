/*El Inspector de Eficiencia (Duelo de Métodos)
Algoritmos obligatorios: Selección vs Inserción

Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso específico.
Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
Lógica de Conteo:
En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.
*/

import java.util.Scanner;

public class ComparacionAlgoritmos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        // Pedir números
        System.out.println("Ingrese 6 números:");

        for (int i = 0; i < 6; i++) {
            numeros[i] = sc.nextInt();
        }

        // Copiar arreglo para usar ambos algoritmos
        int[] seleccion = numeros.clone();
        int[] insercion = numeros.clone();

        int swaps = selectionSort(seleccion);
        int movimientos = insertionSort(insercion);

        System.out.println("\nSelection Sort hizo " + swaps + " intercambios.");
        System.out.println("Insertion Sort hizo " + movimientos + " movimientos.");

        if (swaps < movimientos) {
            System.out.println("Selection Sort fue más eficiente para estos datos.");
        } else if (movimientos < swaps) {
            System.out.println("Insertion Sort fue más eficiente para estos datos.");
        } else {
            System.out.println("Ambos tuvieron la misma eficiencia.");
        }

        sc.close();
    }

    // Selection Sort
    public static int selectionSort(int[] arr) {

        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int menor = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[menor]) {
                    menor = j;
                }
            }

            if (menor != i) {
                int temp = arr[i];
                arr[i] = arr[menor];
                arr[menor] = temp;

                swaps++;
            }
        }

        return swaps;
    }

    // Insertion Sort
    public static int insertionSort(int[] arr) {

        int movimientos = 0;

        for (int i = 1; i < arr.length; i++) {

            int clave = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > clave) {
                arr[j + 1] = arr[j];
                j--;
                movimientos++;
            }

            arr[j + 1] = clave;
        }

        return movimientos;

    }
}
