package Parcial2.tarea6;
//Programa 6
public class Matriz6{
    public static void main(String[]args){
        //Se agrega la matriz 
        int a [][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        System.out.println("Matriz Triangular Superior:");
        // se agrega for pero ahora i < 5
        for (int i = 0; i < 5; ++i){
            for (int j = 0; j < 5; ++j){
                // Se agrega < para que solo los numeros de la parte superior sean afectados 
                if (i<=j){
                    // se agrupa la matris y a la variable i se le suma 1, para que 1 sea 2 asi continuamente 
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
