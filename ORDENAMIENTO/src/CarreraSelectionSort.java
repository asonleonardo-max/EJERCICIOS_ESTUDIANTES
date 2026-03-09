/*El Podio de la Competencia
Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).*/

import java.util.Scanner;

public class CarreraSelectionSort {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos corredores participaron?: ");
        int n = teclado.nextInt();

        double[] tiempos = new double[n];

        // Ingresar tiempos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + " en segundos: ");
            tiempos[i] = teclado.nextDouble();
        }

        // Selection Sort
        for (int i = 0; i < tiempos.length - 1; i++) {
            int menor = i;

            for (int j = i + 1; j < tiempos.length; j++) {
                if (tiempos[j] < tiempos[menor]) {
                    menor = j;
                }
            }

            
            double temp = tiempos[i];
            tiempos[i] = tiempos[menor];
            tiempos[menor] = temp;
        }

        // Mostrar tiempos ordenados
        System.out.println("\nTiempos ordenados de menor a mayor:");
        for (double t : tiempos) {
            System.out.println(t + " segundos");
        }

        // Mostrar ganadores
        if (n >= 3) {
            System.out.println("\nResultados de la carrera:");
            System.out.println("Oro: " + tiempos[0] + " segundos");
            System.out.println("Plata: " + tiempos[1] + " segundos");
            System.out.println("Bronce: " + tiempos[2] + " segundos");
        }

        teclado.close();
    }
}
