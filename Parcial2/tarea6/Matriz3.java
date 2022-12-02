package Parcial2.tarea6;
//Programa 3
import java.util.Scanner;
public class Matriz3 {
    public static void main(String args[]) {
    // Se ingresan la matriz de acuerdo al problema 
        int[][] A = {
            {2, 2,},
            {2, 2,}
        
        };
        int[][] B = {
            {1, 1},
            {1, 1}
        };
    // se agrega el scanner ademas de agregar la escala que se ocupa 
        try (Scanner reader = new Scanner(System.in)) {
            int escalar = 2;
            System.out.println("Escalar : ");
            escalar = reader.nextInt();
        // se agrega el for para ademas de multiplicarlo por la escala necesaria 
        for (int i =0;i < A.length; i++) {
        for(int j = 0; j < A [i].length; j++) {
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
