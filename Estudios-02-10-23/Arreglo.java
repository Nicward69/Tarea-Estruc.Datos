for (int cont = 0; cont < anArray-length; cont++){}
// el contador siempre debe de ser menor
double [][] temperaturas = {{20.5, 30.6, 28.3},{-38.7, -18.3,-16.5}}; 
// Arreglo de 2 dimensiones "[][]"
public void imprimirMatriz (double [][] temp){
    for (int fila = 0; fila < temp.length; fila++){
        for (int columna = 0; columna < temp[fla].length; columna++){
            System.out.print(temp[fila][columna] + ", ");
        }
        System.out.println();
    }
}
//Metodo para imprimir el arreglo de dos dimensiones

//Paso de parametros
//por valor(Tipo primitivo) - copia
//por referencia (objeto - arrays)
//--> Ref. o direccion de memoria

public double promedioMatriz(double [][] m){
    //A nivel de toda la matriz
    double suma = 0;
    for (int fila = 0; fila < m.length; fila++){
        //columans
        for (int col = 0; cola < m[fila].length; col++){
            //Recorrer todos los elementos de cada fila
            suma+= m[fila][col;]
        }
        //recorrer cada fila
    }
    return suma / numElementos
}