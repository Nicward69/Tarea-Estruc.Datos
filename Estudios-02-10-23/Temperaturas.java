public class DemoMatriz{
    public static void main(String[] args){
        double [][] temperatures = { { 20.5, 30.6, 28.3 }, 
                             { -38.7, -18.3, -16.2 } };
        Matriz ObjMatriz = new Matriz();
        ObjMatriz.imprimirMatriz(temperatures);
        System.out.println(temperatures[0][0]); 
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
        
        for (int fila = 0; fila < temp.length; fila++){
            //Columnas
            for (int col = 0; col < temp[fila].length; col++){
                System.out.print(temp[fila][col] + ", ");
            }
            System.out.println();
        }
    }

}