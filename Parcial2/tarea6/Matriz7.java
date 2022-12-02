package Parcial2.tarea6;
//Programa 7
public class Matriz7 {

    public static void main(String[]args){
        // Se agrega la matriz 
        int a [][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println("Matriz Triangular Inferior:");

        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                // se agrega un > para que los numeros de la parte inferior sean afectados
                if (i>=j){
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

