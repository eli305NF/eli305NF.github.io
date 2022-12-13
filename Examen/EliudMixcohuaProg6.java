package Examen;
import java.util.Scanner;
//que imprima tu nombre completo, después capture un número entero positivo denominado n,
// e imprima todos los enteros pares menores o iguales a n
public class EliudMixcohuaProg6 {
    public static void main(String args[]){
      
      System.out.println("Eliud Daniel Mixcohua Núñez");
      try(Scanner sc = new Scanner(System.in)){
        System.out.println("Ingresa un numero");
        int n= sc.nextInt();
        
    for (int i = 2; i <= n; i=i+2) {
      System.out.println(i); 
    }
}
}
}