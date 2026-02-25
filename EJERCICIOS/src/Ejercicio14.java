
/*Ejercicio 14 — Árbol de empleados (no lineal)
Una empresa tiene la siguiente jerarquía:

         Gerente
        /       \
   Supervisor1  Supervisor2
    /      \
 Analista1 Analista2
Modela la jerarquía con nodos que tengan el campo cargo.
Imprime el árbol recorriéndolo nivel por nivel.*/

class NodoEmpleado {

    String cargo;
    NodoEmpleado izquierdo, derecho;

    NodoEmpleado(String cargo) {
        this.cargo = cargo;
    }
}

public class Ejercicio14 {

    public static void imprimir(NodoEmpleado n, int nivel) {
        if (n != null) {
            System.out.println("Nivel " + nivel + ": " + n.cargo);
            imprimir(n.izquierdo, nivel + 1);
            imprimir(n.derecho, nivel + 1);
        }
    }

    public static void main(String[] args) {

        NodoEmpleado gerente = new NodoEmpleado("Gerente");

        gerente.izquierdo = new NodoEmpleado("Supervisor 1");
        gerente.derecho = new NodoEmpleado("Supervisor 2");

        gerente.izquierdo.izquierdo = new NodoEmpleado("Analista 1");
        gerente.izquierdo.derecho = new NodoEmpleado("Analista 2");

        imprimir(gerente, 0);
    }
}