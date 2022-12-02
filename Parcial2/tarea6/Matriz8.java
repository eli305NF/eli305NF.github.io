package Parcial2.tarea6;
//Programa 8
public class Matriz8 {

    public static void main(String[]args){

        int a [][] = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };
        System.out.println("Matriz Diagonal:");
        // Se agrega for para dar las condiciones ademas de  cambiar i < "4" para tomar solo 4 numeros
        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){

                if (i>=j){
                    a[i][i] = i+1;
                }
            }
        } 

        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
