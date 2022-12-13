package Examen;
//que imprima tu nombre, matrícula y define una matriz  de 8 x 8 posiciones de tipo Entero, 
//las inicialize con 0, e imprimir todos elementos 	que se encuentren por debajo de la diagonal principal, 
//así como la suma de todos esos elementos.
public class EliudMixcohuaProg10 {
    
    public static void main(String args[]){
        System.out.println("Nombre:Eliud Daniel, Matricula:Matrcula:S22022255");
    
int a[][] = {
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},
    {0, 0, 0, 0, 0, 0, 0, 0},

};
System.out.println("Diagonal inferior");

        for (int i = 0; i < 8; ++i){
            for (int j = 0; j < 8; ++j){
                if (i>=j){
                    a[i][j] = i+1;
                }

}
}
        for (int i = 0; i < 8; ++i){
            for (int j = 0; j < 8; ++j){
                System.out.print(a[i][j] + " ");
    }
            System.out.println();

    }
       
}
}