package Vectorespararepresentarfuerzas;

/**
 *
 * @author Camara Torres Cesar, Diaz Bautista Rodrigo, Mora Zavala Enrique
 * @version 1.0
 * @since 24/10/23
 */
class Vector  {
    private double x;
    private double y;

    public Vector(double x, double y) { //Metodo para Almacenar los datos (x,y) del vector
        this.x = x; // Cordenada X
        this.y = y; // Cordenada Y 
    }

    public double getMagnitud() { //Metodo para la magnitudes de vectores
        return Math.sqrt(x * x + y * y); //Formula para calcular la Magnitud de un vector
    }

    public double getDireccion() { // Metodo para la direccion de vecores
        return Math.atan2(y, x); // Formula para calcular la direccion de un vector
    }

    public static Vector addVectores(Vector v1, Vector v2) { // Metodo para la suma de vectores
        double newX = v1.x + v2.x; // Suma de vector x1 y x2 
        double newY = v1.y + v2.y; // Suma de vector y1 y y2
        return new Vector(newX, newY);
    }

    public String toString() {
        return String.format("Vector(%.2f, %.2f)", x, y);
    }
}