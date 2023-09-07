package newpackage;

/**
 *
 * @author Camara Torres Cesar Augusto
 * @date 05/09/2023
 * @version 1.0
 * @since 05/09/2023
 * @Errors 
 */
public class ColorARGB {
    //Atributos declaradas como entero
    private int alpha;
    private int red;
    private int green;
    private int blue;

    public ColorARGB(int alpha, int red, int green, int blue) {
        this.alpha = alpha;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    // Metodos get para los atributos A, R, G, B
    public int getAlpha() {
        return alpha;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }
    //Metodos para obtener la representacion binaria como una solo cadena de bits
    public String toBinaryString() {
         // Usar operaciones de desplazamiento a la izquierda para crear máscaras binarias
        String alphaBinary = String.format("%8s", Integer.toBinaryString(alpha)).replace(' ', '0');
        String redBinary = String.format("%8s", Integer.toBinaryString(red)).replace(' ', '0');
        String greenBinary = String.format("%8s", Integer.toBinaryString(green)).replace(' ', '0');
        String blueBinary = String.format("%8s", Integer.toBinaryString(blue)).replace(' ', '0');

        // Concatenar los valores binarios
        return alphaBinary + redBinary + greenBinary + blueBinary;
          
    }
    //Metodo toString para unir los atributos en una sola cadena
    @Override
    public String toString() {
        return "Color A: " + alpha + ", R: " + red + ", G: " + green + ", B: " + blue;
    }
}
