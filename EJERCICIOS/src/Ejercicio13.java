public class Ejercicio13 {

    /*Ejercicio 13 — Clasificación de residuos (no lineal)
Modela una jerarquía de tipos de residuos con una estructura de árbol usando nodos:

        Residuos
       /        \
  Orgánicos   Inorgánicos
   /    \       /      \
Comida Jardín Plástico Papel
Crea la clase NodoResiduo con un campo nombre y referencias izquierdo y derecho.
Construye el árbol mostrado.
Imprime la raíz y todos sus descendientes indicando el nivel.*/

    static class NodoResiduo {
        String nombre;
        NodoResiduo izquierdo, derecho;

        NodoResiduo(String nombre) {
            this.nombre = nombre;
        }
    }

    public static void imprimir(NodoResiduo nodo, int nivel) {
        if (nodo != null) {
            System.out.println("Nivel " + nivel + ": " + nodo.nombre);
            imprimir(nodo.izquierdo, nivel + 1);
            imprimir(nodo.derecho, nivel + 1);
        }
    }

    public static void main(String[] args) {

        NodoResiduo raiz = new NodoResiduo("Residuos");

        raiz.izquierdo = new NodoResiduo("Orgánicos");
        raiz.derecho = new NodoResiduo("Inorgánicos");

        raiz.izquierdo.izquierdo = new NodoResiduo("Comida");
        raiz.izquierdo.derecho = new NodoResiduo("Jardín");

        raiz.derecho.izquierdo = new NodoResiduo("Plástico");
        raiz.derecho.derecho = new NodoResiduo("Papel");

        imprimir(raiz, 0);
    }
}
