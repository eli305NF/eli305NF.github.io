package Parcial2.tarea6;
//Programa 5
public class Prueva{

    public static void main(String[]args){
    // se agrega la matriz 
        int a[][] = {
            {5, 7, 0},
            {-1, 4, 3},
            {0, 2, 5}
        };
        System.out.println("Matriz");
     //se agrega for que lea la matriz 
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                // los numeros impresos saldran con un espacio 
                System.out.print(a[i][j]+ " " );
            }
             System.out.println();
        }

        int suma = 0;
        // Se agrega for para dar las condiciones 
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

