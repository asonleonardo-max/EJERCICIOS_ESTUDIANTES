public class Ejercicio6 {

    /*Ejercicio 6 — Turno en un banco
Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActual y se asigna a turnoEnPantalla.

Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
Explica en un comentario por qué ocurre esto.*/
    
    public static void main(String[] args) {

        int turnoActual = 25;
        int turnoEnPantalla = turnoActual;

        turnoEnPantalla = 26;

        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        // Explicación:
        // Los tipos primitivos (int, double, boolean, etc.)
        // se copian POR VALOR.
        // Cambiar turnoEnPantalla no afecta a turnoActual
        // porque son variables independientes en memoria.

    }
}
