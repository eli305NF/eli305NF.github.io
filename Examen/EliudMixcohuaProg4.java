package Examen;

import java.util.Scanner;

//que imprima tu nombre, matrícula y capture un número entero positivo, 
//si está en el rango de 1 a 12, imprimir el mes que representa: ENERO, FEBRERO, .. DICIEMBRE
public class EliudMixcohuaProg4 {
    public static void main(String args[]){
        System.out.println("Nombre:Eliud Daniel, Matricula:S22022255");
        
            try (Scanner sc = new Scanner(System.in)) { 
                System.out.println("Ingrese un numero:");
                int mes = sc.nextInt();
                
            String mesString;
            switch (mes) {
    
            case 1:  mesString = "Enero";
                     break;
            case 2:  mesString  = "Febrero";
                     break;
            case 3:  mesString = "Marzo";
                     break;
            case 4:  mesString = "Abril";
                     break;
            case 5:  mesString = "Mayo";
                     break;
            case 6:  mesString = "Junio";
                     break;
            case 7:  mesString = "Julio";
                     break;
            case 8:  mesString = "Agosto";
                     break;
            case 9:  mesString = "Septiembre";
                     break;
            case 10: mesString = "Octubre";
                     break;
            case 11: mesString = "Noviembre";
                     break;
            case 12: mesString = "Diciembre";
                     break;
            default: mesString = "Invalid month";
                     break;
            }
            System.out.println(mesString);
        }
    }
    }

            
      

