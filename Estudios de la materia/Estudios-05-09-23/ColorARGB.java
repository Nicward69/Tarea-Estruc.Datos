
public class ColorARGB
{
    public static void main(String [] args)
    {
        int intARGB = 0;
         //a = 255, r = 247, g = 177, b = 24
        intARGB = intARGB | 0b11111111;
        System.out.println("Valor ARGB: " + intARGB + "bits "+ Integer.toBinaryString(intARGB));
        
        intARGB = intARGB << 8;
        System.out.println("Valor ARGB: " + intARGB + "bits: " + Integer.toBinaryString(intARGB));
        
        intARGB = intARGB | 0xF7; //247 // 0b 1111 0111
        System.out.println("Valor ARGB: " + intARGB + "bits: " + Integer.toBinaryString(intARGB));
        
        intARGB = intARGB << 8;
        System.out.println("Valor ARGB: " + intARGB + "bits: " + Integer.toBinaryString(intARGB));
        
        intARGB = intARGB | 177; //0xB  //0b 1011 0001
        intARGB = intARGB << 8;
        System.out.println("Valor ARGB: " + intARGB + "bits: " + Integer.toBinaryString(intARGB));
        
        intARGB = intARGB | 24; //0x18  //0b 0001 1000    
        //ya no hay desplazamiento porque ya terminamos la secuencia de los numeros
        System.out.println("Valor ARGB: " + intARGB + "bits: " + Integer.toBinaryString(intARGB));
        
        
        intARGB = 0;
        intARGB = intARGB | 0xFFF7B118; //0b 1111 1111 1111 0111 1011 0001 0001 1000
        
        //int A = 255;
        //int R = 247;
        //int G = 177;
        //int B = 24;
        
        //int intARGB = (char)A + (char)R + (char)G + (char)B;
    
        //intARGB = intARGB;
        //System.out.println(" ");
    }

    }    