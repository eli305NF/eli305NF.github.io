package Parcial2.tarea6;
//Programa 2
import java.util.Scanner;

public class Escalar {
    public static void main(String args[]) {
        // se ingresa una matriz A y una B 
        int[][] A = {
            {2, 0, 1},
            {3, 0, 0},
            {5, 1, 1}
        };
        int[][] B = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
    
        try (Scanner reader = new Scanner(System.in)) {
            int escalar = 2;
            System.out.println("Escalar : ");
            escalar = reader.nextInt();
        // se ocupa for para 
        for (int i =0;i < A.length; i++) {
        for(int j = 0; j < A [i].length; j++) {
        // aqui se multiplica la matriz con escalar(VARIANTE)
            B[i][j]= A[i][j] * escalar; 
        }
        }
        }
        
    for (int i =0;i < B.length; ++i) {
        for(int j = 0; j < B [i].length; ++j) {
            System.out.print(B[i][j] + " ");
        }
        System.out.println("");
    }
    
}
}   
