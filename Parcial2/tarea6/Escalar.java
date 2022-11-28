package Parcial2.tarea6;
//Programa 2
import java.util.Scanner;

public class Escalar {
    public static void main(String args[]) {
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

        Scanner reader = new Scanner(System.in);
            int escalar = 2;
            System.out.println("Escalar : ");
            escalar = reader.nextInt();
        
        for (int i =0;i < A.length; i++) {
        for(int j = 0; j < A [i].length; j++) {
            B[i][j]= A[i][j] * escalar; 
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
