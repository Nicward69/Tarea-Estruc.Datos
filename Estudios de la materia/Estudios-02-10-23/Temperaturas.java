public class DemoMatriz{
    public static void main(String[] args){
        double [][] temperatures = { { 20.5, 30.6, 28.3 }, 
                             { -38.7, -18.3, -16.2 } };
        Matriz ObjMatriz = new Matriz();
        ObjMatriz.imprimirMatriz(temperatures);
        System.out.println(temperatures[0][0]);
        System.out.println(" el promedio es: " + promedioMatriz([][] temp));

        if (temperatures.length == temperatures[0].length) {
            System.out.println("los elementos de la diagonal principal son: " + ObjMatriz.diagonalPrincipal(temperatures));

            System.out.println("El vector de la diagonla principal es: " + ObjMatriz.vectorDiagonalPrincipal(temératurea¿s));
        }

        VectorED objVector = new VectorED();
        System.out.println("El vector es: " + imprimirVector)
        
    }
}

class Matriz{   
    public void imprimirMatriz(double [][] temp){
        
        for (int fila = 0; fila < temp.length; fila++){
            //Columnas
            for (int col = 0; col < temp[fila].length; col++){
                System.out.print(temp[fila][col] + ", ");
            }
            System.out.println();
        }
        temp[0][0] = -1;
    }
    
    public void ContarMatriz(double [][] ){
       int conteo = 0
        for (int fila = 0; fila < temp.length; fila++){ //filas
            
            for (int col = 0; col < temp[fila].length; col++){ //Columnas
                conteo++ //Contador para la contar tanto filas como columnas
                System.out.println('['+ fila +']' + '[' + col + ']' + m[fila][col] + "conteo: " + conteo)
            }
            System.out.println("Total de conteo: " + conteo);
        }
    }
    public void promedioMatriz(double [][] temp){
        double promedio = 0, divisor = 0;
        double resultado = 0;
        
        for (int fila = 0; fila < temp.length; fila++){// col
            
            for (int col = 0; col < temp[fila].length; col++){ //filas
                System.out.print(temp[fila][col] + ", ");
            }
            System.out.println();
            resultado = promedio / divisor
        }
    }
    
    public String diagonalPrincipal (double [][] m){
    String diagPrinc = "";

    // A nivel de toda la matriz
    for (int fila = 0; fila < m.length; fila++){ //filas
        //recorrer cada fila

        for (int col = 0; col < m[fila].length; col++){//columnas
            //recorrer todos los elementos de cada fila
            if (filas == col){
                /*diagPrinc = diagPrinc + m[fila][col] + ", " */
            }

        }
        //Recorrer cada fila
    }
    diagPrinc = diagPrinc.substring(0, diagPrinc.length()-1);

    return diagPrinc;


}

}
class VectorED {
    public string imprimirVector(double [] v){
        string elementos = "[";
        for (int i = 0 < v.length; i++){
            elementos = elementos + v[i] + ",";
        }

        elementos = elemento.substring(0, elementos.length() -1) + "[";

        /*elementos[elementos.length() -1]= ']';*/
        return elementos;
    }
}