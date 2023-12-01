
public class ListaSimple{
	Node top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}

	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}

    public Node buscarPorPosicion(int posicion) {
		if (posicion < 0) {
			return null; // Posición inválida
		}
	
		Node nodoActual = this.top;
		int contador = 0;
	
		while (nodoActual != null) {
			if (contador == posicion) {
				return nodoActual; // Se encontró el nodo en la posición especificada
			}
			contador++;
			nodoActual = nodoActual.next;
		}
	
		return null; // La posición especificada está más allá de la longitud de la lista
	}

	public void insertarAntesDelUltimo(String nombre) {
		Node nuevoNodo = new Node();
		nuevoNodo.name = nombre;
		
		// Verificar si la lista está vacía
		if (this.top == null) {
			this.top = nuevoNodo;
			return;
		}
		
		// Verificar si la lista tiene un solo nodo
		if (this.top.next == null) {
			nuevoNodo.next = this.top;
			this.top = nuevoNodo;
			return;
		}
		
		// Recorrer la lista para encontrar el nodo antes del último
		Node nodoActual = this.top;
		while (nodoActual.next.next != null) {
			nodoActual = nodoActual.next;
		}
		
		nuevoNodo.next = nodoActual.next;
		nodoActual.next = nuevoNodo;
	}
	
	public void intercambiarNodos(String buscado1, String buscado2) {
		if (buscado1.equals(buscado2)) {
			// No se puede intercambiar un nodo consigo mismo
			return;
		}
	
		Node nodoAnterior1 = null;
		Node nodoAnterior2 = null;
		Node nodoActual = this.top;
	
		// Buscar los nodos a intercambiar y sus nodos anteriores
		while (nodoActual != null && (nodoAnterior1 == null || nodoAnterior2 == null)) {
			if (nodoActual.next != null && nodoActual.next.name.equals(buscado1)) {
				nodoAnterior1 = nodoActual;
			}
			if (nodoActual.next != null && nodoActual.next.name.equals(buscado2)) {
				nodoAnterior2 = nodoActual;
			}
			nodoActual = nodoActual.next;
		}
	
		// Verificar si se encontraron ambos nodos
		if (nodoAnterior1 != null && nodoAnterior2 != null) {
			Node temp = nodoAnterior1.next;
			nodoAnterior1.next = nodoAnterior2.next;
			nodoAnterior2.next = temp;
	
			temp = nodoAnterior1.next.next;
			nodoAnterior1.next.next = nodoAnterior2.next.next;
			nodoAnterior2.next.next = temp;
		}
	}

}














