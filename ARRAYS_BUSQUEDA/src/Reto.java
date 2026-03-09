import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        int[] intentos = new int[8];

        System.out.println("Ingrese 8 IDs:");


        for (int i = 0; i < 8; i++) {
            intentos[i] = sc.nextInt();
        }

        int mayor = intentos[0];
        for (int i = 1; i < 8; i++) {
            if (intentos[i] > mayor) {
                mayor = intentos[i];
            }
        }

        System.out.println("ID más alto: " + mayor);

        int[] listaNegra = {50, 120, 450, 800, 999};


        int inicio = 0;
        int fin = listaNegra.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (listaNegra[medio] == mayor) {
                encontrado = true;
                break;
            } else if (listaNegra[medio] < mayor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (encontrado) {
            System.out.println("Ya está en la lista negra.");
        } else {
            System.out.println("Nuevo atacante detectado.");
        }

        sc.close();
    
    }
}
