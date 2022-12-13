package Examen;
import java.util.Scanner;
//que imprima tu nombre, capture un número entero y determine si es Positivo, Negativo o es Cero.
public class EliudMixcohuaProg2 {
    
        public static void main(String[] args) {
          System.out.println("Eliud Daniel");
      
         try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Ingresa un numero");
          int number = sc.nextInt();

            if(number > 0) {
              System.out.println("El numero es positivo");
            }
            
           if(number < 0) {
            System.out.println("El numero es negativo");
           }

           if(number == 0) {
            System.out.println("El numero es 0");
           }
        }
          
          }
        }
        
        
