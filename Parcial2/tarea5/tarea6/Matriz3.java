package Parcial2.tarea5.tarea6;
//Programa 3
import java.util.Scanner;
public class Matriz3 {
    public static void main(String args[]) {
        int[][] A = {
            {2, 2,},
            {2, 2,}
        
        };
        int[][] B = {
            {1, 1},
            {1, 1}
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
