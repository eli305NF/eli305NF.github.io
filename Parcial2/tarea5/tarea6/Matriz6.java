package Parcial2.tarea5.tarea6;
//Programa 6
public class Matriz6{
    public static void main(String[]args){
        int a [][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println("Matriz Triangular Superior:");

        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                if (i<=j){
                    a[i][j] = i+1;
                }
            }
        }

        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
