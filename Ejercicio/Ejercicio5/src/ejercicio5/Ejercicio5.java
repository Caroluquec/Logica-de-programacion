

package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
     Scanner lea= new Scanner (System.in);
     String animal;
     Float porciones, precio, total;
        System.out.println("Ingrese nombre del animal");
        animal= lea.nextLine();
        System.out.println("Ingrese numero de porciones por día");
        porciones= lea.nextFloat();
        System.out.println("Ingrese precio de las porciones");
        precio= lea.nextFloat();
        
        total= precio*porciones;
        
        System.out.println("Ingrese nombre del animal " + animal + " Costo del alimento por día " + total);
     
             
     
        
        
        
        
    }
    
}
