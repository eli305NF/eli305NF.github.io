package Parcial2.tarea6;
//Programa 10
import java.util.Scanner;

public class Matriz10 {
    public static void main (String[]args){
      
            int a [][]={
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
            };

            System.out.println("Matriz escalar capturada:");

            try (Scanner num = new Scanner(System.in)) {
                System.out.print("Ingrese un valor: ");
                int n=num.nextInt();
            
            for (int i = 0; i < a.length; ++i){
                a[i][i] = n;
            }

            for (int i = 0; i < 4; ++i){
                for (int j = 0; j < 4; ++j){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}