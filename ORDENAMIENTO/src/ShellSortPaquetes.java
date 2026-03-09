/*El Salto de Shell (Optimización de Datos)
Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
N
/
2
. El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases de reducción de saltos.*/

import java.util.Scanner;

public class ShellSortPaquetes {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de paquetes: ");
        int n = teclado.nextInt();

        int[] pesos = new int[n];

        // Ingresar pesos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = teclado.nextInt();
        }

        // Mostrar arreglo original
        System.out.println("\nArreglo original:");
        mostrarArreglo(pesos);

        int gap = n / 2;

        while (gap > 0) {

            for (int i = gap; i < n; i++) {

                int temp = pesos[i];
                int j = i;

                while (j >= gap && pesos[j - gap] > temp) {
                    pesos[j] = pesos[j - gap];
                    j -= gap;
                }

                pesos[j] = temp;
            }

            gap = gap / 2;
        }

        // Mostrar arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        mostrarArreglo(pesos);

        teclado.close();
    }

    public static void mostrarArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        /* Shell Sort funciona usando saltos (gap).
           Primero compara elementos que están lejos entre sí.
           Esto permite mover rápidamente valores grandes o pequeños
           cerca de su posición final, por eso suele ser más rápido
           que la inserción simple cuando los datos están muy desordenados.
        */
    }
}
