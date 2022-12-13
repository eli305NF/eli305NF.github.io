package Examen;
//que imprima tu nombre, matrícula y capture un número entero positivo, si está en el rango de 0 a 9, imprimir es DIGITO.
import java.util.Scanner;
public class EliudMixcohuaProg3 {

    public static void main(String args[]){
        System.out.println("Nombre:Eliud Daniel, Matricula:S22022255");
     try (Scanner sc = new Scanner(System.in)) { 
          System.out.println("Ingrese un numero:");
          int num = sc.nextInt();

      if ( (num > 9) || (num < 0) );
       else {
          System.out.println("es DIGITO");
          }
      }
  }
}
     
      



        

  
       
  