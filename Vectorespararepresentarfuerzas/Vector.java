package Vectorespararepresentarfuerzas;

/**
 *
 * @author Camara Torres Cesar
 */
class Vector  {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getMagnitud() {
        return Math.sqrt(x * x + y * y);
    }

    public double getDireccion() {
        return Math.atan2(y, x);
    }

    public static Vector addVectores(Vector v1, Vector v2) {
        double newX = v1.x + v2.x;
        double newY = v1.y + v2.y;
        return new Vector(newX, newY);
    }

    public String toString() {
        return String.format("Vector(%.2f, %.2f)", x, y);
    }
}