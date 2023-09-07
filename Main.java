package newpackage;

/**
 *
 * @author Camara Torres Cesar Augusto
 * @date 05/09/2023
 * @version 1.0
 * @since 05/09/2023
 * @Errors 
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de Alpha: ");
        int alpha = scanner.nextInt();

        System.out.print("Introduce el valor de Red: ");
        int red = scanner.nextInt();

        System.out.print("Introduce el valor de Green: ");
        int green = scanner.nextInt();

        System.out.print("Introduce el valor de Blue: ");
        int blue = scanner.nextInt();

        ColorARGB color = new ColorARGB(alpha, red, green, blue);
        System.out.println(color.toString());
         System.out.println("Representacion binaria: " + color.toBinaryString());


        scanner.close();
    }
    
}