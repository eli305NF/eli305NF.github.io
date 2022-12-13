package Examen;
//Que imprima tu nombre,
//Matrícula y defina una matriz  de 3 x 3 posiciones de tipo Entero, 
//las inicialize con 0, e imprimir los elementos de la diagonal principal, 
//así como la suma de los elementos de la diagonal.
public class EliudMixcohuaProg9 {
   
    public static void main(String args[]) {
        System.out.println("Nombre:Eliud Daniel, Matricula:Matrcula:S22022255");
        int n = 3;
        int a[][] = { {0, 0, 0},
                      {0, 3, 8},
                      {0, 2, 9},
                     
                    };
    printPrincipalDiagonal(a, n);
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
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                if (i == j) {
                // 
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
       
        System.out.println("");
        
    }
}



