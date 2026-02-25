/*Ejercicio 3 — Sensor de temperatura
Un sensor industrial registra temperaturas. El sistema recibe:

Temperatura actual en Celsius (double)
Nombre del sensor (String)
Número de lectura (int)
Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
Imprime el estado del sensor con todos sus datos.*/

public class Ejercicio_3 {
    public static void main(String[] args) {

        double temperatura = 85.5;
        String nombreSensor = "Sensor A1";
        int numeroLectura = 12;

        boolean enAlarma = temperatura > 80;

        System.out.println("Nombre del sensor: " + nombreSensor);
        System.out.println("Número de lectura: " + numeroLectura);
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("En alarma: " + enAlarma);
    }
}