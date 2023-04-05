
package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

  
    public static void main(String[] args) {
    Scanner lea= new Scanner (System.in);
    String cliente;
    float  meses;
    double porc_int=0.018, intereses, total,prestamo;
        System.out.println("Ingrese nombre del cliente");
        cliente= lea.nextLine();
        System.out.println("Valor prestamo");
        prestamo=lea.nextFloat();
        System.out.println("Meses");
        meses=lea.nextFloat();
        
        intereses= prestamo*porc_int*meses;
        total=prestamo+intereses;
        System.out.println("Nombre del cliente " + cliente + " Valor del prestamo " + prestamo + " Porcentaje de intereses de 1.8% Meses " + meses + " Valor de intereses " + intereses + " Total a pagar " + total);
                
               
        
    
   
    }
    
}