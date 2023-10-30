package Vectorespararepresentarfuerzas;

/**
 *
 * @author Camara Torres Cesar
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los componentes del primer vector de fuerza:");
        System.out.print("Componente X: ");
        double x1 = scanner.nextDouble();
        System.out.print("Componente Y: ");
        double y1 = scanner.nextDouble();
        Vector vector1 = new Vector(x1, y1);

        System.out.println("Ingresa los componentes del segundo vector de fuerza:");
        System.out.print("Componente X: ");
        double x2 = scanner.nextDouble();
        System.out.print("Componente Y: ");
        double y2 = scanner.nextDouble();
        Vector vector2 = new Vector(x2, y2);

        // Calcular la magnitud y dirección de los vectores
        System.out.println("Magnitud del primer vector: " + vector1.getMagnitud());
        System.out.println("Dirección del primer vector: " + vector1.getDireccion());
        System.out.println("Magnitud del segundo vector: " + vector2.getMagnitud());
        System.out.println("Dirección del segundo vector: " + vector2.getDireccion());

        // Calcular la suma de los vectores
        Vector sumaVectores = Vector.addVectores(vector1, vector2);
        System.out.println("Suma de vectores: " + sumaVectores);

        scanner.close();
    }
}
    

