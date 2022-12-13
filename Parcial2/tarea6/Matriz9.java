package Parcial2.tarea6;
//Programa 9
public class Matriz9 {
    public static void main(String[]args){

        //Matriz Ingresada.
        int a [][]={
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };
        System.out.println("Matriz Identidad: ");
        // se agrega for para dar las condiciones para saber donde poner las numeros 
        for (int i = 0; i < a.length; ++i){
            // los numeros impresos por la condicion seran 1 o dependiente de la variable 
        
            a[i][i] = 1;
        }

        for (int i = 0; i < 4; ++i){
            for (int j = 0; j < 4; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}