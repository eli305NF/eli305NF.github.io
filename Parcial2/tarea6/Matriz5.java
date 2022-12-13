package Parcial2.tarea6;
//Programa 5
public class Matriz5 {

    public static void main(String[]args){
    // se agrega la matriz 
        int a[][] = {
            {5, 7, 0},
            {-1, 4, 3},
            {0, 2, 5}
        };
     
        int suma = 0;
         
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                if (i==j) {
    
                    suma += a[i][j];
                }
            }
        }
        System.out.println("La suma del diagonal es: "+suma);
    }
}

