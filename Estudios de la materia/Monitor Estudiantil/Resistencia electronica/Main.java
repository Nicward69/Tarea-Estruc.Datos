public class CalculadoraResistencia {

    public static void main(String[] args) {
        // Definir el código de colores de la resistencia
        String[] colores = {"Verde", "Azul", "Amarillo", "Oro"};
        
        // Calcular el valor de la resistencia
        double valorResistencia = calcularValorResistencia(colores);
        
        
        // Calcular la tolerancia de la resistencia
        double tolerancia = calcularTolerancia(colores);
        
        // Imprimir el resultado
        System.out.println("Valor de la resistencia: " + valorResistencia + " Ohmios");
        System.out.println("Tolerancia de la resistencia: " + tolerancia + "%");
    }

    // Función para calcular el valor de la resistencia
    public static double calcularValorResistencia(String[] colores) {
        if (colores.length != 4) {
            throw new IllegalArgumentException("Debe proporcionar 4 colores");
        }
        
        // Definir los valores de los colores y los multiplicadores
        String[] coloresValores = {"Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Oro", "Plata", "Ninguno"};
        double[] valores = {0.0, 10.0, 100.0, 1000.0, 10000.0, 100000.0, 1000000.0, 10000000.0, 0.0, 0.0, 0.1, 0.01, 0.0};
        
        // Obtener los valores de las dos primeras bandas
        double valorBanda1 = valores[indexOf(colores[0], coloresValores)];
        double valorBanda2 = valores[indexOf(colores[1], coloresValores)];
        
        // Obtener el multiplicador de la tercera banda
        double multiplicador = valores[indexOf(colores[2], coloresValores)];
        
        // Calcular el valor de la resistencia
        double valorResistencia = (valorBanda1 * 10 + valorBanda2) * multiplicador;
        
        return valorResistencia;
    }

    // Función para calcular la tolerancia de la resistencia
    public static double calcularTolerancia(String[] colores) {
        if (colores.length != 4) {
            throw new IllegalArgumentException("Debe proporcionar 4 colores");
        }
        
        // Definir los valores de las tolerancias
        String[] coloresTolerancias = {"Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Oro", "Plata", "Ninguno"};
        double[] tolerancias = {20.0, 2.0, 3.0, 4.0, 5.0, 0.5, 0.25, 0.1, 0.05, 10.0, 5.0, 10.0, 20.0};
        
        // Obtener la tolerancia de la cuarta banda
        double tolerancia = tolerancias[indexOf(colores[3], coloresTolerancias)];
        
        return tolerancia;
    }

    // Función para buscar el índice de un elemento en un arreglo
    private static int indexOf(String target, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Color no válido: " + target);
    }
}
