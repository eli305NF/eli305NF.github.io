package Parcial2.tarea5.tarea6;
//Programa 5
public class Matriz5 {

    public static void main(String[]args){
        int a[][] = {
            {5, 7, 0},
            {-1, 4, 3},
            {0, 2, 5}
        };
        System.out.println("Matriz");
     
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j]+ " " );
            }
             System.out.println();
        }

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

