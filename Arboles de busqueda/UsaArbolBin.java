public class UsaArbolBin {

    public static void main(String[] args) {
        // Crear un árbol binario
        ArbolBinario arbol = new ArbolBinario("A");

        // Agregar nodos
        arbol.agregarHijoIzquierdo("B", arbol.raiz);
        arbol.agregarHijoDerecho("C", arbol.raiz);
        arbol.agregarHijoIzquierdo("D", arbol.raiz.izquierdo);
        arbol.agregarHijoDerecho("E", arbol.raiz.izquierdo);
        arbol.agregarHijoIzquierdo("F", arbol.raiz.derecho);
        arbol.agregarHijoDerecho("G", arbol.raiz.derecho);

        // Imprimir el árbol de forma horizontal
        System.out.println("Árbol binario:");
        arbol.imprimirArbol(arbol.raiz, 0);

        // Buscar un nodo (debes implementar la lógica en buscarNodo)
        String datoBuscado = "D";
        ArbolBinario.Node nodoBuscado = arbol.buscarNodo(arbol.raiz, datoBuscado);
        System.out.println("Nodo encontrado: " + (nodoBuscado != null ? nodoBuscado.name : "No encontrado"));

        // Recorrer el árbol en preorden
        System.out.println("Recorrido en preorden:");
        arbol.preOrden(arbol.raiz);
        System.out.println();

        // Recorrer el árbol en inorden
        System.out.println("Recorrido en inorden:");
        arbol.inOrden(arbol.raiz);
        System.out.println();

        // Recorrer el árbol en postorden
        System.out.println("Recorrido en postorden:");
        arbol.postOrden(arbol.raiz);
        System.out.println();

        // Eliminar un nodo (debes implementar la lógica en eliminarNodo)
        String datoAEliminar = "F";
        arbol.eliminarNodo(datoAEliminar);
        System.out.println("Árbol después de eliminar el nodo " + datoAEliminar + ":");
        arbol.imprimirArbol(arbol.raiz, 0);
    }
}
