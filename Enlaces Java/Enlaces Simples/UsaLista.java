public class UsaLista {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "A");

        Node nodoEnPosicion = lista.buscarPorPosicion(2); // Busca el nodo en la posición 2
        if (nodoEnPosicion != null) {
            System.out.println("El nodo en la posición 2 es: " + nodoEnPosicion.name);
        } else {
            System.out.println("No se encontró ningún nodo en la posición especificada.");
        }

        lista.intercambiarNodos("O", "Y");
        lista.insertarAntesDelUltimo("NUEVO"); // Inserta un nuevo nodo antes del último
        lista.imprimir();


    }
}