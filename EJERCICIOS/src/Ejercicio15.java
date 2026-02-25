public class Ejercicio15 {

    /*Ejercicio 15 — Registro de temperaturas semanales (lineal)
Una estación meteorológica registra la temperatura máxima de cada día de la semana en un arreglo.

Llena el arreglo con 7 valores.
Calcula el promedio semanal.
Indica qué días estuvieron por encima del promedio.*/

    public static void main(String[] args) {

        double[] temp = {28, 30, 29, 31, 32, 27, 26};
        double suma = 0;

        for (double t : temp) {
            suma += t;
        }

        double promedio = suma / temp.length;
        System.out.println("Promedio semanal: " + promedio);

        String[] dias = {
            "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"
        };

        System.out.println("Días por encima del promedio:");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > promedio) {
                System.out.println(dias[i] + ": " + temp[i]);
            }
        }
    }
}
