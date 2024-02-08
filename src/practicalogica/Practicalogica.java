
package practicalogica;

import java.util.Scanner;


public class Practicalogica {


    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESAR LA PALABRA: ");
        String palabra = scanner.nextLine();
        System.out.println("LA PALABRA:   " + palabra + "   EL PUNTEO ES DE: " + calcularPalabra(palabra.toUpperCase()));
    }
    public static int calcularPalabra(String palabraCalculada){
        int calculo = 0;
        
        for (int i = 0; i < palabraCalculada.length(); i++) {
            switch(palabraCalculada.charAt(i)){
                case 'A':
                case 'E':
                case 'I':    
                case 'O':    
                case 'U':
                case 'L':
                case 'N':
                case 'R': 
                case 'S':
                case 'T': 
                    calculo = calculo + 1;
                    break;
                case 'D':
                case 'G':
                    calculo = calculo + 2;
                    break;
                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    calculo = calculo + 4;
                    break;
                case 'B':
                case 'C':    
                case 'M':    
                case 'P':
                    calculo = calculo + 3;
                    break;
                case 'J':
                case 'X':
                    calculo = calculo + 8;
                    break;
                case 'K':
                    calculo = calculo + 5;
                    break;
                case 'Q':
                case 'Z':
                    calculo = calculo + 10;
                    break;
            }
          
        }
       return calculo;
    }

}
