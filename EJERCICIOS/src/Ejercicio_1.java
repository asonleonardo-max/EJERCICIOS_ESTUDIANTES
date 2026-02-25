/*Ejercicio 1 — Ficha de un estudiante
Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.

Declara las variables con los tipos de datos apropiados.
Asigna valores de ejemplo.
Imprime un reporte por consola con el siguiente formato:
=== Ficha del Estudiante ===
Nombre: Ana Torres
Código: 20241001
Semestre: 3
Promedio: 3.85
Matriculado: true*/

public class Ejercicio_1 {
    public static void main(String[] args) {

        String nombre = "Ana Torres";
        int codigo = 20241001;
        int semestre = 3;
        double promedio = 3.85;
        boolean matriculado = true;

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matriculado: " + matriculado);
    }
}