public class ArbolBinario {

    static class Node {
        String name;
        Node izquierdo;
        Node derecho;
    }

    Node raiz;

    public ArbolBinario(String dato) {
        // Crear raiz
        this.raiz = new Node();
        this.raiz.name = dato;
        this.raiz.izquierdo = null;
        this.raiz.derecho = null;
    }

    public void agregarHijoIzquierdo(String dato, Node arbol) {
        // Crear nodo
        Node hijo = new Node();
        hijo.name = dato;
        hijo.izquierdo = null;
        hijo.derecho = null;

        // Agregar como hijo izquierdo
        arbol.izquierdo = hijo;

        // Liberar la referencia auxiliar
        hijo = null;
    }

    public void agregarHijoDerecho(String dato, Node arbol) {
        // Crear nodo
        Node hijo = new Node();
        hijo.name = dato;
        hijo.izquierdo = null;
        hijo.derecho = null;

        // Agregar como hijo derecho
        arbol.derecho = hijo;

        // Liberar la referencia auxiliar
        hijo = null;
    }

    // Método para imprimir el árbol de forma horizontal
    public void imprimirArbol(Node nodo, int nivel) {
        if (nodo != null) {
            imprimirArbol(nodo.derecho, nivel + 1);

            for (int i = 0; i < nivel; i++) {
                System.out.print("   ");
            }

            System.out.println(nodo.name);
            imprimirArbol(nodo.izquierdo, nivel + 1);
        }
    }

    // Método para buscar un nodo
    public Node buscarNodo(Node nodo, String dato) {
        // Implementar la búsqueda según tus necesidades
        return null;
    }

    // Método para recorrer el árbol en preorden
    public void preOrden(Node nodo) {
        if (nodo != null) {
            System.out.print(nodo.name + " ");
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    // Método para recorrer el árbol en inorden
    public void inOrden(Node nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.name + " ");
            inOrden(nodo.derecho);
        }
    }

    // Método para recorrer el árbol en postorden
    public void postOrden(Node nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.name + " ");
        }
    }

    // Método para eliminar un nodo
    public void eliminarNodo(String dato) {
        // Implementar la eliminación según tus necesidades
    }
}
