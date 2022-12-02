package Parcial2.tarea6;
//programa 1
  class MatrizPrintln {
  public static void main(String[] args) {
// la matriz     
    int[][] A = {
        {1, -2, 3},
        {-4, -5, 6, 9},
        {7},
    };
// se imprime la matriz al ingresar el for marcando las condiciones
for (int i =0;i < A.length; ++i) {
    for(int j = 0; j < A [i].length; ++j) {
        System.out.print(A[i][j] + " ");
    }
    //se crea un espacio para que los numeros de la matriz no aparescan juntos
    System.out.println("");
}
  }
}

