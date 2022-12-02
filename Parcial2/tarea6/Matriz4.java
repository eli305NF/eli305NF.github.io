package Parcial2.tarea6;
//Programa 4
public class Matriz4{
    public static void main(String args[]) {
        // se agrega la matriz que se necesite 
        // n son los numero que se tomaran 
        int n = 4;
        int a[][] = { {-1, 7, 0, 17},
                      {12, -3, 8, 6},
                      {2, 9, 3, -4},
                      {15, 6, 1, 0} 
                    };
    // se agrega printPrincipalDiagonal para agrupar a y n 
    printPrincipalDiagonal(a, n);
      
    }
  //Se agrega el static void para leerlo 
    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");
    // se agrega el for para dar la condicion  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
 
                // si no se ejecuta la condicion de for se ejecuta if 
                if (i == j) {
                // 
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        //Espacio entre los numeros 
        System.out.println("");
    }
}


