package Parcial2.tarea6;

//programa 1

  class MatrizPrintln {
  public static void main(String[] args) {
    
    int[][] a = {
        {1, -2, 3},
        {-4, -5, 6, 9},
        {7},
    };

for (int i =0;i < a.length; ++i) {
    for(int j = 0; j < a [i].length; ++j) {
        System.out.print(a[i][j] + " ");
    }
    System.out.println("");
}


  }
}

